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
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
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
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
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
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
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
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
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
	private IParser executableNodeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getExecutableNodeName_5013Parser() {
		if (executableNodeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			executableNodeName_5013Parser = parser;
		}
		return executableNodeName_5013Parser;
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
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
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
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
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
	private IParser localPerformanceAnnotationConcurrentUsers_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5006Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditPattern("«lpc»"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5006Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5007Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5007Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_ConcurrentUsers() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5007Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationSecsTimeLimit_5008Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationSecsTimeLimit_5008Parser() {
		if (localPerformanceAnnotationSecsTimeLimit_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getPerformanceAnnotation_SecsTimeLimit() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationSecsTimeLimit_5008Parser = parser;
		}
		return localPerformanceAnnotationSecsTimeLimit_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationMinimumTime_5009Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationMinimumTime_5009Parser() {
		if (localPerformanceAnnotationMinimumTime_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("minimum = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationMinimumTime_5009Parser = parser;
		}
		return localPerformanceAnnotationMinimumTime_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationWeight_5010Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationWeight_5010Parser() {
		if (localPerformanceAnnotationWeight_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getLocalPerformanceAnnotation_Weight() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationWeight_5010Parser = parser;
		}
		return localPerformanceAnnotationWeight_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser executableNodeName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getExecutableNodeName_5012Parser() {
		if (executableNodeName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			executableNodeName_5012Parser = parser;
		}
		return executableNodeName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNodeName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNodeName_5011Parser() {
		if (objectNodeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceProcess.ServiceProcessPackage.eINSTANCE
					.getNamedElement_Name() };
			serviceProcess.diagram.parsers.MessageFormatParser parser = new serviceProcess.diagram.parsers.MessageFormatParser(
					features);
			objectNodeName_5011Parser = parser;
		}
		return objectNodeName_5011Parser;
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
		case serviceProcess.diagram.edit.parts.ExecutableNodeNameEditPart.VISUAL_ID:
			return getExecutableNodeName_5013Parser();
		case serviceProcess.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID:
			return getObjectNodeName_5014Parser();
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getPerformanceAnnotationConcurrentUsers_5015Parser();
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getPerformanceAnnotationConcurrentUsers_5016Parser();
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getPerformanceAnnotationSecsTimeLimit_5017Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5006Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5007Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationSecsTimeLimit_5008Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationMinimumTime_5009Parser();
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationWeight_5010Parser();
		case serviceProcess.diagram.edit.parts.ExecutableNodeName2EditPart.VISUAL_ID:
			return getExecutableNodeName_5012Parser();
		case serviceProcess.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID:
			return getObjectNodeName_5011Parser();
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
