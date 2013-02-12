/*
 * 
 */
package serviceProcess.diagram.providers;

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
public class ServiceProcessParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actionName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5018Parser() {
		if (actionName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			actionName_5018Parser = parser;
		}
		return actionName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredActivityNodeName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredActivityNodeName_5027Parser() {
		if (structuredActivityNodeName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«structured» {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			structuredActivityNodeName_5027Parser = parser;
		}
		return structuredActivityNodeName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5001Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5001Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditPattern("«lpc»"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5001Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5002Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5002Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5002Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationSecsTimeLimit_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationSecsTimeLimit_5003Parser() {
		if (localPerformanceAnnotationSecsTimeLimit_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationSecsTimeLimit_5003Parser = parser;
		}
		return localPerformanceAnnotationSecsTimeLimit_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationMinimumTime_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationMinimumTime_5004Parser() {
		if (localPerformanceAnnotationMinimumTime_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("minimum = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationMinimumTime_5004Parser = parser;
		}
		return localPerformanceAnnotationMinimumTime_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationWeight_5005Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationWeight_5005Parser() {
		if (localPerformanceAnnotationWeight_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_Weight() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationWeight_5005Parser = parser;
		}
		return localPerformanceAnnotationWeight_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNodeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNodeName_5014Parser() {
		if (objectNodeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			objectNodeName_5014Parser = parser;
		}
		return objectNodeName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser performanceAnnotationConcurrentUsers_5015Parser;

	/**
	 * @generated
	 */
	private IParser getPerformanceAnnotationConcurrentUsers_5015Parser() {
		if (performanceAnnotationConcurrentUsers_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«gpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«gpc»"); //$NON-NLS-1$
			parser.setEditPattern("«gpc»"); //$NON-NLS-1$
			performanceAnnotationConcurrentUsers_5015Parser = parser;
		}
		return performanceAnnotationConcurrentUsers_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser performanceAnnotationConcurrentUsers_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPerformanceAnnotationConcurrentUsers_5016Parser() {
		if (performanceAnnotationConcurrentUsers_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			performanceAnnotationConcurrentUsers_5016Parser = parser;
		}
		return performanceAnnotationConcurrentUsers_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser performanceAnnotationSecsTimeLimit_5017Parser;

	/**
	 * @generated
	 */
	private IParser getPerformanceAnnotationSecsTimeLimit_5017Parser() {
		if (performanceAnnotationSecsTimeLimit_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			performanceAnnotationSecsTimeLimit_5017Parser = parser;
		}
		return performanceAnnotationSecsTimeLimit_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5019Parser() {
		if (actionName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			actionName_5019Parser = parser;
		}
		return actionName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredActivityNodeName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredActivityNodeName_5026Parser() {
		if (structuredActivityNodeName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«structured» {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			structuredActivityNodeName_5026Parser = parser;
		}
		return structuredActivityNodeName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5020Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5020Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditPattern("«lpc»"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5020Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5021Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5021Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5021Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationSecsTimeLimit_5022Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationSecsTimeLimit_5022Parser() {
		if (localPerformanceAnnotationSecsTimeLimit_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationSecsTimeLimit_5022Parser = parser;
		}
		return localPerformanceAnnotationSecsTimeLimit_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationMinimumTime_5023Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationMinimumTime_5023Parser() {
		if (localPerformanceAnnotationMinimumTime_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("minimum = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationMinimumTime_5023Parser = parser;
		}
		return localPerformanceAnnotationMinimumTime_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationWeight_5024Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationWeight_5024Parser() {
		if (localPerformanceAnnotationWeight_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_Weight() };
			serviceProcess.diagram.parsers.NumbersToDoubleLabelParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleLabelParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationWeight_5024Parser = parser;
		}
		return localPerformanceAnnotationWeight_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNodeName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNodeName_5025Parser() {
		if (objectNodeName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			objectNodeName_5025Parser = parser;
		}
		return objectNodeName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlFlowConditionProbability_6001Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowConditionProbability_6001Parser() {
		if (controlFlowConditionProbability_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getControlFlow_Condition(),
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getControlFlow_Probability() };
			serviceProcess.diagram.parsers.ControlFlowLabelParser parser = new serviceProcess.diagram.parsers.ControlFlowLabelParser(
					features);
			parser.setViewPattern("[{0}] (p = {1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1,number}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1,number}"); //$NON-NLS-1$
			controlFlowConditionProbability_6001Parser = parser;
		}
		return controlFlowConditionProbability_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case serviceProcess.diagram.edit.parts.ActionNameEditPart.VISUAL_ID:
			return getActionName_5018Parser();
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID:
			return getStructuredActivityNodeName_5027Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5001Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5002Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationSecsTimeLimit_5003Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationMinimumTime_5004Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationWeight_5005Parser();
		case serviceProcess.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID:
			return getObjectNodeName_5014Parser();
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getPerformanceAnnotationConcurrentUsers_5015Parser();
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getPerformanceAnnotationConcurrentUsers_5016Parser();
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getPerformanceAnnotationSecsTimeLimit_5017Parser();
		case serviceProcess.diagram.edit.parts.ActionName2EditPart.VISUAL_ID:
			return getActionName_5019Parser();
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID:
			return getStructuredActivityNodeName_5026Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5020Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5021Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationSecsTimeLimit_5022Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationMinimumTime_5023Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationWeight_5024Parser();
		case serviceProcess.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID:
			return getObjectNodeName_5025Parser();
		case serviceProcess.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID:
			return getControlFlowConditionProbability_6001Parser();
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
			return getParser(serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
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
			if (serviceProcess.diagram.providers.ServiceProcessElementTypes
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
