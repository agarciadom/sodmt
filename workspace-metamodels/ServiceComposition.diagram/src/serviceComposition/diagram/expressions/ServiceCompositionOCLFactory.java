/*
 * 
 */
package serviceComposition.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class ServiceCompositionOCLFactory {

	/**
	 * @generated
	 */
	private final serviceComposition.diagram.expressions.ServiceCompositionAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected ServiceCompositionOCLFactory() {
		this.expressions = new serviceComposition.diagram.expressions.ServiceCompositionAbstractExpression[8];
		this.expressionBodies = new String[] {
				"self.oclIsKindOf(serviceComposition::CompositionFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and self <> oppositeEnd", //$NON-NLS-1$
				"self.oclIsKindOf(serviceComposition::CompositionFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and self <> oppositeEnd", //$NON-NLS-1$
				"(self.oclIsKindOf(serviceComposition::CompositionFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::CompositionObjectNode)) or (self.oclIsKindOf(serviceComposition::CompositionObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::CompositionFlowNode)) and self <> oppositeEnd", //$NON-NLS-1$
				"(self.oclIsKindOf(serviceComposition::CompositionFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::CompositionObjectNode)) or (self.oclIsKindOf(serviceComposition::CompositionObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::CompositionFlowNode)) and self <> oppositeEnd", //$NON-NLS-1$
				"self.oclIsKindOf(serviceComposition::ActivityFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and self <> oppositeEnd", //$NON-NLS-1$
				"self.oclIsKindOf(serviceComposition::ActivityFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and self <> oppositeEnd", //$NON-NLS-1$
				"(self.oclIsKindOf(serviceComposition::ActivityFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::ActivityObjectNode)) or (self.oclIsKindOf(serviceComposition::ActivityObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::ActivityFlowNode)) and self <> oppositeEnd", //$NON-NLS-1$
				"(self.oclIsKindOf(serviceComposition::ActivityFlowNode) and not self.oclIsKindOf(serviceComposition::ObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::ActivityObjectNode)) or (self.oclIsKindOf(serviceComposition::ActivityObjectNode) and oppositeEnd.oclIsKindOf(serviceComposition::ActivityFlowNode)) and self <> oppositeEnd", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static ServiceCompositionOCLFactory getInstance() {
		ServiceCompositionOCLFactory instance = serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
				.getInstance().getServiceCompositionOCLFactory();
		if (instance == null) {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().setServiceCompositionOCLFactory(
							instance = new ServiceCompositionOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static serviceComposition.diagram.expressions.ServiceCompositionAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		ServiceCompositionOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static serviceComposition.diagram.expressions.ServiceCompositionAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static serviceComposition.diagram.expressions.ServiceCompositionAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			serviceComposition.diagram.expressions.ServiceCompositionAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
