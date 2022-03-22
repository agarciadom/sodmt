package es.uca.modeling.eol.marte.performance;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.dom.Operation;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.FinalNode;
import org.eclipse.uml2.uml.InitialNode;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PerformanceTest {

	private static final int MAX_LEVELS = 25;
	private static final int FIXED_WEIGHT = 1;
	private static final int FIXED_MTIME = 0;
	private static final int MAX_WEIGHT = 1;
	private static final int THROUGHPUT = 1;
	private static final int RESPONSE_TIME = 1;
	private static final int SAMPLES = 10;
	private static final Random PRNG = new Random(0);
	private static ThreadMXBean THREAD_MXBEAN;
	private static Writer logWriter;

	@Parameters
	public static List<Object[]> data() {
		List<Object[]> results = new ArrayList<Object[]>();
		for (int i = 1; i <= MAX_LEVELS; ++i) {
			results.add(new Object[]{i, SAMPLES});
		}
		return results;
	}

	@BeforeClass
	public static void globalSetUp() throws IOException {
		THREAD_MXBEAN = ManagementFactory.getThreadMXBean();
		THREAD_MXBEAN.setThreadCpuTimeEnabled(true);
		logWriter = new FileWriter(new File("times.txt"));
	}

	private final int mSamples;
	private final int mLevels;
	private EolModule mModule = null;
	private EmfModel mModel = null;

	public PerformanceTest(int levels, int samples) {
		mSamples = samples;
		mLevels  = levels;
	}

	@Test
	public void testFixedThroughput() throws Exception {
		testThroughput(true);
	}

	@Test
	public void testFixedTimeLimits() throws Exception {
		testTimeLimits(true);
	}

	@Test
	public void testRandomThroughput() throws Exception {
		testThroughput(false);
	}

	@Test
	public void testRandomTimeLimits() throws Exception {
		testTimeLimits(false);
	}

	private void annotateFixed(Activity activity) throws EolRuntimeException {
		Operation opAnn = mModule.getOperations().getOperation("annotateFixed");
		opAnn.execute(null, Arrays.asList(activity, RESPONSE_TIME, THROUGHPUT, FIXED_MTIME, FIXED_WEIGHT), mModule.getContext());
	}

	private void annotateRandomly(Activity activity) throws EolRuntimeException {
		Operation opAnn = mModule.getOperations().getOperation("annotateRandom");
		opAnn.execute(null, Arrays.asList(activity, RESPONSE_TIME, THROUGHPUT, MAX_WEIGHT, PRNG), mModule.getContext());
	}

	private Activity createForkJoinGraph(boolean fixedAnnotations) throws EolRuntimeException {
		Operation op = mModule.getOperations().getOperation("createForkJoinActivity");
		Activity activity = (Activity)op.execute(null, Arrays.asList(mLevels), mModule.getContext());
		if (fixedAnnotations) {
			annotateFixed(activity);
		} else {
			annotateRandomly(activity);
		}
		return activity;
	}

	private List<FinalNode> getFinalNodes(final Activity activity) {
		List<FinalNode> finalNodes = new ArrayList<FinalNode>();
		for (ActivityNode node : activity.getNodes()) {
			if (node instanceof FinalNode) {
				finalNodes.add((FinalNode)node);
			}			
		}
		return finalNodes;
	}

	private InitialNode getInitialNode(Activity activity) {
		InitialNode initial = null;
		for (ActivityNode node : activity.getNodes()) {
			if (node instanceof InitialNode) {
				initial = (InitialNode)node;
				break;
			}
		}
		return initial;
	}

	private Activity prepareIteration(boolean fixedAnnotations) throws Exception {
		if (mModule != null) {
			mModule.getContext().getModelRepository().dispose();
			mModule.getContext().dispose();
			mModule = null;
		}
		System.gc();

		mModule = new EolModule();
		mModule.parse(PerformanceTest.class.getResource("/eol/time_algorithms.eol").toURI());
		mModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());

		Resource resource = EmfUtil.createResource();

		mModel = new InMemoryEmfModel("Model", resource, MARTEPackage.eINSTANCE);
		mModel.setModelFile("dummy.model");
		mModel.setReadOnLoad(false);
		mModel.setStoredOnDisposal(false);
		mModel.setCachingEnabled(false);
		mModel.load();
		mModule.getContext().getModelRepository().addModel(mModel);

		mModule.execute();

		return createForkJoinGraph(fixedAnnotations);
	}

	private void print(final String line) throws IOException {
		System.out.println(line);
		logWriter.write(line + "\n");
		logWriter.flush();
	}

	private void testThroughput(boolean fixedAnnotations)
			throws Exception {
		final String type = fixedAnnotations ? "fixed" : "random";
		long total_micros = 0;

		print("\nname, levels, sample, time (ms)");
		for (int i = 0; i < mSamples; ++i) {
			Activity activity = prepareIteration(fixedAnnotations);
			Operation opThroughputs = mModule.getOperations().getOperation("annotateThroughput");
			InitialNode initial = getInitialNode(activity);
			assertNotNull(initial);

			// Run once, as warm-up
			opThroughputs.execute(null, Arrays.asList(initial), mModule.getContext());
			// Wipe cached results, to avoid modifying execution times
			wipeModuleCaches();

			long t0 = THREAD_MXBEAN.getCurrentThreadCpuTime();
			opThroughputs.execute(null, Arrays.asList(initial), mModule.getContext());
			long sample_micros = (THREAD_MXBEAN.getCurrentThreadCpuTime() - t0)/1000;

			total_micros += sample_micros;
			print(String.format(Locale.ENGLISH,
					"%s throughput,%d,%d,%g", type, mLevels, i + 1,
					sample_micros / 1000.0));
		}
		print(String.format(Locale.ENGLISH,
				"%s throughput,%d,avg,%g", type, mLevels, total_micros / 1000.0 / mSamples));
	}

	private void testTimeLimits(boolean fixedAnnotations)
			throws Exception {
		final String type = fixedAnnotations ? "fixed" : "random";
		long total_micros = 0;

		print("\nname, levels, sample, time (ms)");
		for (int i = 0; i < mSamples; ++i) {
			Activity activity = prepareIteration(fixedAnnotations);
			List<FinalNode> finalNodes = getFinalNodes(activity);
			Operation opDistrib = mModule.getOperations().getOperation("distributeTime");

			// Warm-up, to avoid delays due to classloading and other matters
			opDistrib.execute(null, Arrays.asList(RESPONSE_TIME, finalNodes), mModule.getContext());
			// Wipe cached results, to avoid modifying execution times
			wipeModuleCaches();

			long t0 = THREAD_MXBEAN.getCurrentThreadCpuTime();
			opDistrib.execute(null, Arrays.asList(RESPONSE_TIME, finalNodes), mModule.getContext());
			long sample_micros = (THREAD_MXBEAN.getCurrentThreadCpuTime() - t0) / 1000;

			total_micros += sample_micros;
			print(String.format(Locale.ENGLISH,
					"%s time limits,%d,%d,%g", type, mLevels, i + 1,
					sample_micros / 1000.0));
		}
		print(String.format(Locale.ENGLISH,
				"%s time limits,%d,avg,%g", type, mLevels, total_micros
						/ 1000.0 / mSamples));
	}

	private void wipeModuleCaches() {
		for (Operation op : mModule.getOperations()) {
			op.clearCache();
		}
		mModule.getContext().getExtendedProperties().clear();
	}

}
