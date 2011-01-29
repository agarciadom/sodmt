package es.uca.modeling.eol.marte.tests;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ExecutableNode;
import org.junit.Test;

/**
 * Tests that time limits are properly inferred on MDT UML2 models
 * annotated with the MARTE profile, as implemented by the Papyrus
 * project.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class TimeLimitInferenceTest extends AbstractInferenceTest {

	private final static Pattern RE_SPLIT_CONTEXT = Pattern.compile(" *[$:=] *");

	public TimeLimitInferenceTest() {
		super(TIME_LIMITS_EOL_PATH);
	}

	@Test
	public void handleOrderIsCorrectlyAnnotated() throws EolModelElementTypeNotFoundException, EolRuntimeException {
		Map<String, Double> inferredTL = inferTimeLimits(1, true, HANDLEORDER_MODEL_PATH);
		assertEquals("Evaluate Order should have 0.4s", 0.4, inferredTL.get("Evaluate Order"), 0.0001);
		assertEquals("Create Invoice should have 0.2s", 0.2, inferredTL.get("Create Invoice"), 0.0001);
		assertEquals("Perform Payment should have 0.2s", 0.2, inferredTL.get("Perform Payment"), 0.0001);
		assertEquals("Ship Order should have 0.4s", 0.4, inferredTL.get("Ship Order"), 0.0001);
		assertEquals("Close Order should have 0.2s", 0.2, inferredTL.get("Close Order"), 0.0001);
	}

	@Test
	public void handleOrderHasCorrectSWVariables() throws EolModelElementTypeNotFoundException, EolRuntimeException {
		EmfModel model = distributeTime(1, true, HANDLEORDER_MODEL_PATH);
		Map<String, Double> ctxParamMap = buildContextParameterMap(model);
		assertContextParametersEqual(ctxParamMap,
				new String[] { "swEO", "swCI", "swPP", "swSO", "swCO" },
				new Double[] { 0.0, 0.2, 0.2, 0.4, 0.2 });
	}

	private void assertContextParametersEqual(Map<String, Double> ctxVars,
			final String[] expectedParams, final Double[] expectedValues) {
		assertEquals("The GaAnalysisContext should have the expected variables and nothing else",
				expectedParams.length, ctxVars.size());
		for (int i = 0; i < expectedParams.length; ++i) {
			final String expectedVar = expectedParams[i];
			final Double expectedValue = expectedValues[i];
			assertEquals(String.format("The %s context parameter should be equal to %g", expectedVar, expectedValue),
					expectedValue, ctxVars.get(expectedVar), 0.001);
		}
	}

	private Map<String, Double> buildContextParameterMap(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Map<String, Double> ctxVars = new HashMap<String, Double>();
		for (EObject o : model.getAllOfKind("Activity")) {
			Activity a = (Activity)o;

			for (EObject appliedStereotype : a.getStereotypeApplications()) {
				if (!(appliedStereotype instanceof GaAnalysisContext)) continue;

				GaAnalysisContext ctx = (GaAnalysisContext)appliedStereotype;
				for (String ctxParam : ctx.getContext()) {
					final String[] parts = RE_SPLIT_CONTEXT.split(ctxParam);
					final String name = parts[1];
					final Double value = Double.valueOf(parts[3]);
					ctxVars.put(name, value);
				}
			}
		}
		return ctxVars;
	}

	private Map<String, Double> buildTimeLimitMapFromModel(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> execNodes = model.getAllOfKind("ExecutableNode");
		Map<String, Double> mapNameToAction = new HashMap<String, Double>();
		for (EObject o : execNodes) {
			ExecutableNode a = (ExecutableNode) o;

			Map<String, String> keyvalCalc = null;
			for (EObject appliedStereotype : a.getStereotypeApplications()) {
				if (appliedStereotype instanceof GaScenario) {
					GaScenario step = (GaScenario)appliedStereotype;
					for (String hostDemand : step.getHostDemand()) {
						Map<String, String> keyvalHD = getKeyvalMap(hostDemand);
						if ("calc".equals(keyvalHD.get("source"))) {
							keyvalCalc = keyvalHD;
							break;
						}
					}
				}
			}

			if (keyvalCalc != null) {
				final Double timeLimit = Double.valueOf((String)keyvalCalc.get("value"));
				mapNameToAction.put(a.getName(), timeLimit);
			}
		}
		clearModels();

		return mapNameToAction;
	}

	private Map<String, Double> inferTimeLimits(double globalLimit,
			boolean shouldSucceed, String modelPath)
			throws EolModelLoadingException,
			EolModelElementTypeNotFoundException, EolRuntimeException {
		EmfModel model = distributeTime(globalLimit, shouldSucceed, modelPath);
		return buildTimeLimitMapFromModel(model);
	}

	private EmfModel distributeTime(double globalLimit, boolean shouldSucceed,
			String modelPath) throws EolModelLoadingException,
			EolModelElementTypeNotFoundException, EolRuntimeException {
		EmfModel model = loadMarteModel(modelPath);
		List<EObject> endNodes = getEndNodes(model);
		assertEquals(shouldSucceed, (Boolean) callOperation("distributeTime", globalLimit, endNodes));
		return model;
	}
}
