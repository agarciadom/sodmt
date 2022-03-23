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
public class ServiceCompositionParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser actionName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5001Parser() {
		if (actionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			actionName_5001Parser = parser;
		}
		return actionName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredActivityNodeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredActivityNodeName_5010Parser() {
		if (structuredActivityNodeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«structured» {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			structuredActivityNodeName_5010Parser = parser;
		}
		return structuredActivityNodeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5011Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5011Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditPattern("«lpc»"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5011Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5012Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5012Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5012Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationSecsTimeLimit_5013Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationSecsTimeLimit_5013Parser() {
		if (localPerformanceAnnotationSecsTimeLimit_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_SecsTimeLimit() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationSecsTimeLimit_5013Parser = parser;
		}
		return localPerformanceAnnotationSecsTimeLimit_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationMinimumTime_5014Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationMinimumTime_5014Parser() {
		if (localPerformanceAnnotationMinimumTime_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("minimum = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationMinimumTime_5014Parser = parser;
		}
		return localPerformanceAnnotationMinimumTime_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationWeight_5015Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationWeight_5015Parser() {
		if (localPerformanceAnnotationWeight_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation_Weight() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationWeight_5015Parser = parser;
		}
		return localPerformanceAnnotationWeight_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationReps_5030Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationReps_5030Parser() {
		if (localPerformanceAnnotationReps_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation_Reps() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("reps = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationReps_5030Parser = parser;
		}
		return localPerformanceAnnotationReps_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNodeName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNodeName_5016Parser() {
		if (objectNodeName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			objectNodeName_5016Parser = parser;
		}
		return objectNodeName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPartitionName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPartitionName_5025Parser() {
		if (activityPartitionName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			activityPartitionName_5025Parser = parser;
		}
		return activityPartitionName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser performanceAnnotationConcurrentUsers_5026Parser;

	/**
	 * @generated
	 */
	private IParser getPerformanceAnnotationConcurrentUsers_5026Parser() {
		if (performanceAnnotationConcurrentUsers_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«gpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«gpc»"); //$NON-NLS-1$
			parser.setEditPattern("«gpc»"); //$NON-NLS-1$
			performanceAnnotationConcurrentUsers_5026Parser = parser;
		}
		return performanceAnnotationConcurrentUsers_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser performanceAnnotationConcurrentUsers_5027Parser;

	/**
	 * @generated
	 */
	private IParser getPerformanceAnnotationConcurrentUsers_5027Parser() {
		if (performanceAnnotationConcurrentUsers_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			performanceAnnotationConcurrentUsers_5027Parser = parser;
		}
		return performanceAnnotationConcurrentUsers_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser performanceAnnotationSecsTimeLimit_5028Parser;

	/**
	 * @generated
	 */
	private IParser getPerformanceAnnotationSecsTimeLimit_5028Parser() {
		if (performanceAnnotationSecsTimeLimit_5028Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_SecsTimeLimit() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			performanceAnnotationSecsTimeLimit_5028Parser = parser;
		}
		return performanceAnnotationSecsTimeLimit_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5002Parser() {
		if (actionName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			actionName_5002Parser = parser;
		}
		return actionName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredActivityNodeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredActivityNodeName_5009Parser() {
		if (structuredActivityNodeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«structured» {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			structuredActivityNodeName_5009Parser = parser;
		}
		return structuredActivityNodeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5003Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditPattern("«lpc»"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5003Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5004Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5004Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationSecsTimeLimit_5005Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationSecsTimeLimit_5005Parser() {
		if (localPerformanceAnnotationSecsTimeLimit_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_SecsTimeLimit() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationSecsTimeLimit_5005Parser = parser;
		}
		return localPerformanceAnnotationSecsTimeLimit_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationMinimumTime_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationMinimumTime_5006Parser() {
		if (localPerformanceAnnotationMinimumTime_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("minimum = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationMinimumTime_5006Parser = parser;
		}
		return localPerformanceAnnotationMinimumTime_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationWeight_5007Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationWeight_5007Parser() {
		if (localPerformanceAnnotationWeight_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation_Weight() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationWeight_5007Parser = parser;
		}
		return localPerformanceAnnotationWeight_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationReps_5029Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationReps_5029Parser() {
		if (localPerformanceAnnotationReps_5029Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation_Reps() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("reps = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationReps_5029Parser = parser;
		}
		return localPerformanceAnnotationReps_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNodeName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNodeName_5008Parser() {
		if (objectNodeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			objectNodeName_5008Parser = parser;
		}
		return objectNodeName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5017Parser() {
		if (actionName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			actionName_5017Parser = parser;
		}
		return actionName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredActivityNodeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredActivityNodeName_5018Parser() {
		if (structuredActivityNodeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«structured» {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			structuredActivityNodeName_5018Parser = parser;
		}
		return structuredActivityNodeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationConcurrentUsers_5019Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationConcurrentUsers_5019Parser() {
		if (localPerformanceAnnotationConcurrentUsers_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditorPattern("«lpc»"); //$NON-NLS-1$
			parser.setEditPattern("«lpc»"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5019Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5019Parser;
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
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_ConcurrentUsers() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("users = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationConcurrentUsers_5020Parser = parser;
		}
		return localPerformanceAnnotationConcurrentUsers_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationSecsTimeLimit_5021Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationSecsTimeLimit_5021Parser() {
		if (localPerformanceAnnotationSecsTimeLimit_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation_SecsTimeLimit() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("timeLimit = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationSecsTimeLimit_5021Parser = parser;
		}
		return localPerformanceAnnotationSecsTimeLimit_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationMinimumTime_5022Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationMinimumTime_5022Parser() {
		if (localPerformanceAnnotationMinimumTime_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getLocalPerformanceAnnotation_MinimumTime() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("minimum = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationMinimumTime_5022Parser = parser;
		}
		return localPerformanceAnnotationMinimumTime_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationWeight_5023Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationWeight_5023Parser() {
		if (localPerformanceAnnotationWeight_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation_Weight() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("weight = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationWeight_5023Parser = parser;
		}
		return localPerformanceAnnotationWeight_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser localPerformanceAnnotationReps_5031Parser;

	/**
	 * @generated
	 */
	private IParser getLocalPerformanceAnnotationReps_5031Parser() {
		if (localPerformanceAnnotationReps_5031Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation_Reps() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("reps = {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			localPerformanceAnnotationReps_5031Parser = parser;
		}
		return localPerformanceAnnotationReps_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectNodeName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getObjectNodeName_5024Parser() {
		if (objectNodeName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getNamedElement_Name() };
			serviceComposition.diagram.parsers.MessageFormatParser parser = new serviceComposition.diagram.parsers.MessageFormatParser(
					features);
			objectNodeName_5024Parser = parser;
		}
		return objectNodeName_5024Parser;
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
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getControlFlow_Condition(),
					serviceComposition.ServiceCompositionPackage.eINSTANCE.getControlFlow_Probability() };
			serviceComposition.diagram.parsers.ControlFlowLabelParser parser = new serviceComposition.diagram.parsers.ControlFlowLabelParser(
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
		case serviceComposition.diagram.edit.parts.ActionNameEditPart.VISUAL_ID:
			return getActionName_5001Parser();
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID:
			return getStructuredActivityNodeName_5010Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5011Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5012Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationSecsTimeLimit_5013Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationMinimumTime_5014Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationWeight_5015Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationRepsEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationReps_5030Parser();
		case serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID:
			return getObjectNodeName_5016Parser();
		case serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID:
			return getActivityPartitionName_5025Parser();
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
			return getPerformanceAnnotationConcurrentUsers_5026Parser();
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
			return getPerformanceAnnotationConcurrentUsers_5027Parser();
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
			return getPerformanceAnnotationSecsTimeLimit_5028Parser();
		case serviceComposition.diagram.edit.parts.ActionName2EditPart.VISUAL_ID:
			return getActionName_5002Parser();
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID:
			return getStructuredActivityNodeName_5009Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5003Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5004Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationSecsTimeLimit_5005Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationMinimumTime_5006Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationWeight_5007Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationReps_5029Parser();
		case serviceComposition.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID:
			return getObjectNodeName_5008Parser();
		case serviceComposition.diagram.edit.parts.ActionName3EditPart.VISUAL_ID:
			return getActionName_5017Parser();
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeName3EditPart.VISUAL_ID:
			return getStructuredActivityNodeName_5018Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5019Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationConcurrentUsers_5020Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationSecsTimeLimit_5021Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationMinimumTime_5022Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationWeight_5023Parser();
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotationReps_5031Parser();
		case serviceComposition.diagram.edit.parts.ObjectNodeName3EditPart.VISUAL_ID:
			return getObjectNodeName_5024Parser();
		case serviceComposition.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID:
			return getControlFlowConditionProbability_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.getElement(hint) == null) {
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
