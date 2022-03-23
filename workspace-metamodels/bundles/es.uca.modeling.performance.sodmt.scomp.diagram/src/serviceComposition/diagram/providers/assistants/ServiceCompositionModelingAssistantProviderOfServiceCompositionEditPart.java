/*
 * 
 */
package serviceComposition.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ServiceCompositionModelingAssistantProviderOfServiceCompositionEditPart
		extends serviceComposition.diagram.providers.ServiceCompositionModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(12);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011);
		return types;
	}

}
