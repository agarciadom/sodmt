/*
 * 
 */
package serviceComposition.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ServiceCompositionParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser serviceActivityName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getServiceActivityName_5042Parser() {
		if (serviceActivityName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			serviceActivityName_5042Parser = parser;
		}
		return serviceActivityName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositionObjectNodeName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getCompositionObjectNodeName_5048Parser() {
		if (compositionObjectNodeName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			compositionObjectNodeName_5048Parser = parser;
		}
		return compositionObjectNodeName_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationConcurrentUsers_5043Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationConcurrentUsers_5043Parser() {
		if (activityPerformanceAnnotationConcurrentUsers_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("<<sapc>>"); //$NON-NLS-1$
			parser.setEditorPattern("<<sapc>>"); //$NON-NLS-1$
			parser.setEditPattern("<<sapc>>"); //$NON-NLS-1$
			activityPerformanceAnnotationConcurrentUsers_5043Parser = parser;
		}
		return activityPerformanceAnnotationConcurrentUsers_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationConcurrentUsers_5044Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationConcurrentUsers_5044Parser() {
		if (activityPerformanceAnnotationConcurrentUsers_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.NumbersToDoubleParser parser = new serviceComposition.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("concurrentUsers = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			activityPerformanceAnnotationConcurrentUsers_5044Parser = parser;
		}
		return activityPerformanceAnnotationConcurrentUsers_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationSecsTimeLimit_5045Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationSecsTimeLimit_5045Parser() {
		if (activityPerformanceAnnotationSecsTimeLimit_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceComposition.diagram.parsers.NumbersToDoubleParser parser = new serviceComposition.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			activityPerformanceAnnotationSecsTimeLimit_5045Parser = parser;
		}
		return activityPerformanceAnnotationSecsTimeLimit_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityActionName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getActivityActionName_5038Parser() {
		if (activityActionName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			activityActionName_5038Parser = parser;
		}
		return activityActionName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityObjectNodeName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getActivityObjectNodeName_5047Parser() {
		if (activityObjectNodeName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			activityObjectNodeName_5047Parser = parser;
		}
		return activityObjectNodeName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionPerformanceAnnotationConcurrentUsers_5039Parser;

	/**
	 * @generated
	 */
	private IParser getActionPerformanceAnnotationConcurrentUsers_5039Parser() {
		if (actionPerformanceAnnotationConcurrentUsers_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("<<apc>>"); //$NON-NLS-1$
			parser.setEditorPattern("<<apc>>"); //$NON-NLS-1$
			parser.setEditPattern("<<apc>>"); //$NON-NLS-1$
			actionPerformanceAnnotationConcurrentUsers_5039Parser = parser;
		}
		return actionPerformanceAnnotationConcurrentUsers_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionPerformanceAnnotationConcurrentUsers_5040Parser;

	/**
	 * @generated
	 */
	private IParser getActionPerformanceAnnotationConcurrentUsers_5040Parser() {
		if (actionPerformanceAnnotationConcurrentUsers_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.NumbersToDoubleParser parser = new serviceComposition.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("concurrentUsers = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			actionPerformanceAnnotationConcurrentUsers_5040Parser = parser;
		}
		return actionPerformanceAnnotationConcurrentUsers_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionPerformanceAnnotationSecsTimeLimit_5041Parser;

	/**
	 * @generated
	 */
	private IParser getActionPerformanceAnnotationSecsTimeLimit_5041Parser() {
		if (actionPerformanceAnnotationSecsTimeLimit_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceComposition.diagram.parsers.NumbersToDoubleParser parser = new serviceComposition.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			actionPerformanceAnnotationSecsTimeLimit_5041Parser = parser;
		}
		return actionPerformanceAnnotationSecsTimeLimit_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionPerformanceAnnotationMinimumTime_5046Parser;

	/**
	 * @generated
	 */
	private IParser getActionPerformanceAnnotationMinimumTime_5046Parser() {
		if (actionPerformanceAnnotationMinimumTime_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceComposition.diagram.parsers.NumbersToDoubleParser parser = new serviceComposition.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("minTime = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			actionPerformanceAnnotationMinimumTime_5046Parser = parser;
		}
		return actionPerformanceAnnotationMinimumTime_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionPerformanceAnnotationWeight_5049Parser;

	/**
	 * @generated
	 */
	private IParser getActionPerformanceAnnotationWeight_5049Parser() {
		if (actionPerformanceAnnotationWeight_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getLocalPerformanceAnnotation_Weight() };
			serviceComposition.diagram.parsers.NumbersToDoubleParser parser = new serviceComposition.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			actionPerformanceAnnotationWeight_5049Parser = parser;
		}
		return actionPerformanceAnnotationWeight_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionPerformanceAnnotationManuallyAdded_5051Parser;

	/**
	 * @generated
	 */
	private IParser getActionPerformanceAnnotationManuallyAdded_5051Parser() {
		if (actionPerformanceAnnotationManuallyAdded_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActionPerformanceAnnotation_ManuallyAdded() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("manual = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			actionPerformanceAnnotationManuallyAdded_5051Parser = parser;
		}
		return actionPerformanceAnnotationManuallyAdded_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositionControlFlowConditionProbability_6003Parser;

	/**
	 * @generated
	 */
	private IParser getCompositionControlFlowConditionProbability_6003Parser() {
		if (compositionControlFlowConditionProbability_6003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getControlFlow_Condition(),
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getControlFlow_Probability() };
			serviceComposition.diagram.parsers.ControlFlowLabelParser parser = new serviceComposition.diagram.parsers.ControlFlowLabelParser(
					features);
			parser.setViewPattern("[{0}] (p = {1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1,number}"); //$NON-NLS-1$
			compositionControlFlowConditionProbability_6003Parser = parser;
		}
		return compositionControlFlowConditionProbability_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityControlFlowConditionProbability_6004Parser;

	/**
	 * @generated
	 */
	private IParser getActivityControlFlowConditionProbability_6004Parser() {
		if (activityControlFlowConditionProbability_6004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getControlFlow_Condition(),
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getControlFlow_Probability() };
			serviceComposition.diagram.parsers.ControlFlowLabelParser parser = new serviceComposition.diagram.parsers.ControlFlowLabelParser(
					features);
			parser.setViewPattern("[{0}] (p = {1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1,number}"); //$NON-NLS-1$
			activityControlFlowConditionProbability_6004Parser = parser;
		}
		return activityControlFlowConditionProbability_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case serviceComposition.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID:
			return getServiceActivityName_5042Parser();
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeNameEditPart.VISUAL_ID:
			return getCompositionObjectNodeName_5048Parser();
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationConcurrentUsers_5043Parser();
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationConcurrentUsers_5044Parser();
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationSecsTimeLimit_5045Parser();
		case serviceComposition.diagram.edit.parts.ActivityActionNameEditPart.VISUAL_ID:
			return getActivityActionName_5038Parser();
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeNameEditPart.VISUAL_ID:
			return getActivityObjectNodeName_5047Parser();
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getActionPerformanceAnnotationConcurrentUsers_5039Parser();
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getActionPerformanceAnnotationConcurrentUsers_5040Parser();
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getActionPerformanceAnnotationSecsTimeLimit_5041Parser();
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
			return getActionPerformanceAnnotationMinimumTime_5046Parser();
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationWeightEditPart.VISUAL_ID:
			return getActionPerformanceAnnotationWeight_5049Parser();
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationManuallyAddedEditPart.VISUAL_ID:
			return getActionPerformanceAnnotationManuallyAdded_5051Parser();
		case serviceComposition.diagram.edit.parts.CompositionControlFlowConditionProbabilityEditPart.VISUAL_ID:
			return getCompositionControlFlowConditionProbability_6003Parser();
		case serviceComposition.diagram.edit.parts.ActivityControlFlowConditionProbabilityEditPart.VISUAL_ID:
			return getActivityControlFlowConditionProbability_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (serviceComposition.diagram.providers.ServiceCompositionElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
