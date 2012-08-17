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
	private IParser serviceActivityName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getServiceActivityName_5036Parser() {
		if (serviceActivityName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			serviceActivityName_5036Parser = parser;
		}
		return serviceActivityName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationConcurrentUsers_5029Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationConcurrentUsers_5029Parser() {
		if (activityPerformanceAnnotationConcurrentUsers_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("<<sapc>>"); //$NON-NLS-1$
			parser.setEditorPattern("<<sapc>>"); //$NON-NLS-1$
			parser.setEditPattern("<<sapc>>"); //$NON-NLS-1$
			activityPerformanceAnnotationConcurrentUsers_5029Parser = parser;
		}
		return activityPerformanceAnnotationConcurrentUsers_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationConcurrentUsers_5030Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationConcurrentUsers_5030Parser() {
		if (activityPerformanceAnnotationConcurrentUsers_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.NumbersToDoubleParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("concurrentUsers = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			activityPerformanceAnnotationConcurrentUsers_5030Parser = parser;
		}
		return activityPerformanceAnnotationConcurrentUsers_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationSecsTimeLimit_5031Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationSecsTimeLimit_5031Parser() {
		if (activityPerformanceAnnotationSecsTimeLimit_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceProcess.diagram.parsers.NumbersToDoubleParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			activityPerformanceAnnotationSecsTimeLimit_5031Parser = parser;
		}
		return activityPerformanceAnnotationSecsTimeLimit_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationMinimumTime_5032Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationMinimumTime_5032Parser() {
		if (activityPerformanceAnnotationMinimumTime_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceProcess.diagram.parsers.NumbersToDoubleParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("minTime = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			activityPerformanceAnnotationMinimumTime_5032Parser = parser;
		}
		return activityPerformanceAnnotationMinimumTime_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationWeight_5037Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationWeight_5037Parser() {
		if (activityPerformanceAnnotationWeight_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_Weight() };
			serviceProcess.diagram.parsers.NumbersToDoubleParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			activityPerformanceAnnotationWeight_5037Parser = parser;
		}
		return activityPerformanceAnnotationWeight_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPerformanceAnnotationManuallyAdded_5041Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPerformanceAnnotationManuallyAdded_5041Parser() {
		if (activityPerformanceAnnotationManuallyAdded_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getActivityPerformanceAnnotation_ManuallyAdded() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("manual = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			activityPerformanceAnnotationManuallyAdded_5041Parser = parser;
		}
		return activityPerformanceAnnotationManuallyAdded_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser processPerformanceAnnotationConcurrentUsers_5033Parser;

	/**
	 * @generated
	 */
	private IParser getProcessPerformanceAnnotationConcurrentUsers_5033Parser() {
		if (processPerformanceAnnotationConcurrentUsers_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("<<sppc>>"); //$NON-NLS-1$
			parser.setEditorPattern("<<sppc>>"); //$NON-NLS-1$
			parser.setEditPattern("<<sppc>>"); //$NON-NLS-1$
			processPerformanceAnnotationConcurrentUsers_5033Parser = parser;
		}
		return processPerformanceAnnotationConcurrentUsers_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser processPerformanceAnnotationConcurrentUsers_5034Parser;

	/**
	 * @generated
	 */
	private IParser getProcessPerformanceAnnotationConcurrentUsers_5034Parser() {
		if (processPerformanceAnnotationConcurrentUsers_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.NumbersToDoubleParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("concurrentUsers = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			processPerformanceAnnotationConcurrentUsers_5034Parser = parser;
		}
		return processPerformanceAnnotationConcurrentUsers_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser processPerformanceAnnotationSecsTimeLimit_5035Parser;

	/**
	 * @generated
	 */
	private IParser getProcessPerformanceAnnotationSecsTimeLimit_5035Parser() {
		if (processPerformanceAnnotationSecsTimeLimit_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceProcess.diagram.parsers.NumbersToDoubleParser parser = new serviceProcess.diagram.parsers.NumbersToDoubleParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,number}"); //$NON-NLS-1$
			processPerformanceAnnotationSecsTimeLimit_5035Parser = parser;
		}
		return processPerformanceAnnotationSecsTimeLimit_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser processControlFlowConditionProbability_6002Parser;

	/**
	 * @generated
	 */
	private IParser getProcessControlFlowConditionProbability_6002Parser() {
		if (processControlFlowConditionProbability_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getControlFlow_Condition(),
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getControlFlow_Probability() };
			serviceProcess.diagram.parsers.ControlFlowLabelParser parser = new serviceProcess.diagram.parsers.ControlFlowLabelParser(
					features);
			parser.setViewPattern("[{0}] (p = {1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1,number}"); //$NON-NLS-1$
			processControlFlowConditionProbability_6002Parser = parser;
		}
		return processControlFlowConditionProbability_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case serviceProcess.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID:
			return getServiceActivityName_5036Parser();
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationConcurrentUsers_5029Parser();
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationConcurrentUsers_5030Parser();
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationSecsTimeLimit_5031Parser();
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationMinimumTime_5032Parser();
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationWeightEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationWeight_5037Parser();
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationManuallyAddedEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotationManuallyAdded_5041Parser();
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getProcessPerformanceAnnotationConcurrentUsers_5033Parser();
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getProcessPerformanceAnnotationConcurrentUsers_5034Parser();
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getProcessPerformanceAnnotationSecsTimeLimit_5035Parser();
		case serviceProcess.diagram.edit.parts.ProcessControlFlowConditionProbabilityEditPart.VISUAL_ID:
			return getProcessControlFlowConditionProbability_6002Parser();
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
