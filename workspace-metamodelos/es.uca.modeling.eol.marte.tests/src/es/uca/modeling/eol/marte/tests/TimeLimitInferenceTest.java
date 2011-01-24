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
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.UMLPackage;
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

	@Test
	public void handleOrderIsCorrectlyAnnotated() throws EolModelElementTypeNotFoundException, EolRuntimeException {
		Map<String, Double> inferredTL = inferTimeLimits(1, true, "model.uml");
		assertEquals("Evaluate Order should have 0.4s", 0.4, inferredTL.get("Evaluate Order"), 0.0001);
		assertEquals("Create Invoice should have 0.2s", 0.2, inferredTL.get("Create Invoice"), 0.0001);
		assertEquals("Perform Payment should have 0.2s", 0.2, inferredTL.get("Perform Payment"), 0.0001);
		assertEquals("Ship Order should have 0.4s", 0.4, inferredTL.get("Ship Order"), 0.0001);
		assertEquals("Close Order should have 0.2s", 0.2, inferredTL.get("Close Order"), 0.0001);
	}

	private Map<String, Double> buildTimeLimitMapFromModel(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> activities = model.getAllOfKind("ExecutableNode");
		Map<String, Double> mapNameToActivity = new HashMap<String, Double>();
		for (EObject o : activities) {
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
				mapNameToActivity.put(a.getName(), timeLimit);
			}
		}
		clearModels();

		return mapNameToActivity;
	}

	private static final Pattern REGEX_COMMA_SPLIT = Pattern.compile(" *, *");
	private static final Pattern REGEX_EQUAL_SPLIT = Pattern.compile(" *= *");
	private Map<String, String> getKeyvalMap(String hostDemand) {
		Map<String, String> map = new HashMap<String, String>();
		if (!hostDemand.startsWith("(")) return map;
		for (String keyval : REGEX_COMMA_SPLIT.split(hostDemand.substring(1, hostDemand.length()-1))) {
			String[] parts = REGEX_EQUAL_SPLIT.split(keyval);
			map.put(parts[0], parts[1]);
		}
		return map;
	}

	private Map<String, Double> inferTimeLimits(double globalLimit,
			boolean shouldSucceed, String modelPath)
			throws EolModelLoadingException,
			EolModelElementTypeNotFoundException, EolRuntimeException {
		EmfModel model = loadModel("", modelPath, UMLPackage.eNS_URI);
		loadModel("MARTE", modelPath, MARTEPackage.eNS_URI);
		List<EObject> endNodes = getEndNodes(model);
		assertEquals(shouldSucceed, (Boolean) callOperation("distributeTime", globalLimit, endNodes));
		return buildTimeLimitMapFromModel(model);
	}
}
