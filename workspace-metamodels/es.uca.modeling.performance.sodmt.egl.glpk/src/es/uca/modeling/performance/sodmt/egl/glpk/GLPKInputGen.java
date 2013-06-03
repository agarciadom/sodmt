package es.uca.modeling.performance.sodmt.egl.glpk;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.util.StringUtil;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.util.FileUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.dt.launching.EclipseContextManager;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class GLPKInputGen {
	private static final String SOLUTION_UNFEASIBLE_MARKER = "PROBLEM HAS NO PRIMAL FEASIBLE SOLUTION";
	private static final String SOLUTION_END_MARKER = "END_SUW";
	private static final String SOLUTION_START_MARKER = "BEGIN_SUW";
	private static final String PATH_TO_EGL = "/egl/generate-glpk-input.egl";

	public void generate(EObject node) throws Exception {
		final FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
		dialog.setFilterExtensions(new String[]{ "*.model" });
		dialog.setFilterNames(new String[]{ "GLPK models" });
		final String path = dialog.open();
		if (path == null) return;
		final File outputFile = new File(path);

		try {
			runEGL(node, loadResourceAsModel(node.eResource()), PATH_TO_EGL, outputFile);

			MessageDialog.openInformation(
					getShell(),
					"GLPK input model generation",
					"GLPK input model successfully generated at "
							+ outputFile.getCanonicalPath());
		} catch (Exception ex) {
			MessageDialog
					.openError(
							getShell(),
							"GLPK input model generation",
							String.format(
									"Failed to generate GLPK input model at '%s'. Please check your Error Log view.",
									outputFile.getCanonicalPath()));

			throw ex;
		}
	}

	public Map<String, BigDecimal> solve(EObject node) throws Exception {
		final File fTmpProblem = File.createTempFile("sodmtglpk", ".model");
		try {
			runEGL(node, loadResourceAsModel(node.eResource()), PATH_TO_EGL, fTmpProblem);
			return solveWithGlpsol(fTmpProblem);
		}
		catch (Exception e) {
			MessageDialog.openError(
					getShell(),
					"GLPK time limit inference algorithm failed",
					"The time limits could not be inferred.\n\n" + e.getMessage());
			throw e;
		} finally {
			fTmpProblem.delete();
		}
	}

	private Map<String, BigDecimal> solveWithGlpsol(final File fTmpProblem)
			throws IOException, Exception, InterruptedException {
		// Launch glpsol (we're not going to send anything through the standard input)
		final ProcessBuilder pb = new ProcessBuilder("glpsol", "--model", fTmpProblem.getPath());
		final Process glpsol = pb.start();
		glpsol.getOutputStream().close();

		// Process the standard output from glpsol
		final Map<String, BigDecimal> results = new HashMap<String, BigDecimal>();
		final BufferedReader bR = new BufferedReader(new InputStreamReader(glpsol.getInputStream()));
		String line;

		// Skip until we get to the BEGIN_SUW line
		while (true) {
			line = bR.readLine();

			if (SOLUTION_START_MARKER.equals(line)) {
				break;
			}
			else if (line == null) {
				throw new Exception("glpsol did not produce the expected output format: no start marker was found.");
			}
			else if (SOLUTION_UNFEASIBLE_MARKER.equals(line)) {
				throw new Exception("The problem is unfeasible.");
			}
		}

		// Read until we reach the END_SUW line
		while ((line = bR.readLine()) != null && !SOLUTION_END_MARKER.equals(line)) {
			final String[] parts = line.trim().split("\\t");
			if (parts.length != 2) {
				throw new Exception("glpsol did not produce the expected output format: '" + line + "' did not have two parts.");
			}

			final String taskName = parts[0];
			final BigDecimal suw = new BigDecimal(parts[1]);
			results.put(taskName, suw);
		}

		// Make sure we found the END_SUW line
		if (line == null) {
			throw new Exception("glpsol did not produce the expected output format: no end marker was found.");
		}

		// Consume the rest of stdout, just in case
		while (bR.readLine() != null);

		// Wait for the process to exit and make sure it reports a successful exit status
		final int status = glpsol.waitFor();
		if (status != 0) {
			throw new Exception("glpsol exited with a non-zero status code: " + status + ".");
		}
		return results;
	}

	private Model loadResourceAsModel(final Resource res) throws EolModelLoadingException {
		final Model model = new InMemoryEmfModel(res);

		model.setName("Model");
		model.setStoredOnDisposal(false);
		model.setReadOnLoad(true);
		model.load();

		return model;
	}

	private static void runEGL(EObject node, final Model model, final String pathToEGL,
			final File outputFile) throws Exception {
		// Parse the EGL script
		final EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		final EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.parse(GLPKInputGen.class.getResource(pathToEGL).toURI());

		// Run it
		EclipseContextManager.setup(eglModule.getContext());
		eglModule.getContext().getModelRepository().addModel(model);
		final EolModelElementType eolType = EolModelElementType.forName(node.eClass().getName(), eglModule.getContext());
		eglModule.getContext().getFrameStack().putGlobal(new Variable("selected", node, eolType));

		// Save the result to a file
		final String result = StringUtil.toString(eglModule.execute());
		FileUtil.write(outputFile, result);
	}

	private static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
}
