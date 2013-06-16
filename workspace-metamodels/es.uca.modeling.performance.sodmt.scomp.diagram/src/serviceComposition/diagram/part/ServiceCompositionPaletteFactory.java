/*
 * 
 */
package serviceComposition.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ServiceCompositionPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				serviceComposition.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAction1CreationTool());
		paletteContainer.add(createActivityPartition2CreationTool());
		paletteContainer.add(createDecision3CreationTool());
		paletteContainer.add(createFinalNode4CreationTool());
		paletteContainer.add(createFork5CreationTool());
		paletteContainer.add(createGlobalPerformanceConstraint6CreationTool());
		paletteContainer.add(createInitialNode7CreationTool());
		paletteContainer.add(createJoin8CreationTool());
		paletteContainer.add(createLocalPerformanceConstraint9CreationTool());
		paletteContainer.add(createMerge10CreationTool());
		paletteContainer.add(createObjectNode11CreationTool());
		paletteContainer.add(createStructuredActivityNode12CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				serviceComposition.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createControlFlow1CreationTool());
		paletteContainer.add(createLinkPerformanceAnnotation2CreationTool());
		paletteContainer.add(createObjectFlow3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.Action1CreationTool_title,
				serviceComposition.diagram.part.Messages.Action1CreationTool_desc,
				types);
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityPartition2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityPartition2CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityPartition2CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005));
		entry.setId("createActivityPartition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecision3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.Decision3CreationTool_title,
				serviceComposition.diagram.part.Messages.Decision3CreationTool_desc,
				types);
		entry.setId("createDecision3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalNode4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.FinalNode4CreationTool_title,
				serviceComposition.diagram.part.Messages.FinalNode4CreationTool_desc,
				types);
		entry.setId("createFinalNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.Fork5CreationTool_title,
				serviceComposition.diagram.part.Messages.Fork5CreationTool_desc,
				types);
		entry.setId("createFork5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlobalPerformanceConstraint6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.GlobalPerformanceConstraint6CreationTool_title,
				serviceComposition.diagram.part.Messages.GlobalPerformanceConstraint6CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011));
		entry.setId("createGlobalPerformanceConstraint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialNode7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.InitialNode7CreationTool_title,
				serviceComposition.diagram.part.Messages.InitialNode7CreationTool_desc,
				types);
		entry.setId("createInitialNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.Join8CreationTool_title,
				serviceComposition.diagram.part.Messages.Join8CreationTool_desc,
				types);
		entry.setId("createJoin8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocalPerformanceConstraint9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.LocalPerformanceConstraint9CreationTool_title,
				serviceComposition.diagram.part.Messages.LocalPerformanceConstraint9CreationTool_desc,
				types);
		entry.setId("createLocalPerformanceConstraint9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMerge10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3020);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.Merge10CreationTool_title,
				serviceComposition.diagram.part.Messages.Merge10CreationTool_desc,
				types);
		entry.setId("createMerge10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectNode11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ObjectNode11CreationTool_title,
				serviceComposition.diagram.part.Messages.ObjectNode11CreationTool_desc,
				types);
		entry.setId("createObjectNode11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredActivityNode12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011);
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.StructuredActivityNode12CreationTool_title,
				serviceComposition.diagram.part.Messages.StructuredActivityNode12CreationTool_desc,
				types);
		entry.setId("createStructuredActivityNode12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlFlow1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.ControlFlow1CreationTool_title,
				serviceComposition.diagram.part.Messages.ControlFlow1CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001));
		entry.setId("createControlFlow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkPerformanceAnnotation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.LinkPerformanceAnnotation2CreationTool_title,
				serviceComposition.diagram.part.Messages.LinkPerformanceAnnotation2CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003));
		entry.setId("createLinkPerformanceAnnotation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectFlow3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.ObjectFlow3CreationTool_title,
				serviceComposition.diagram.part.Messages.ObjectFlow3CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002));
		entry.setId("createObjectFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
