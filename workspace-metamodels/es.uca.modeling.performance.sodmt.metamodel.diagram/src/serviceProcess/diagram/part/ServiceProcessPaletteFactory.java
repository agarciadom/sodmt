/*
 * 
 */
package serviceProcess.diagram.part;

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
public class ServiceProcessPaletteFactory {

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
				serviceProcess.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAction1CreationTool());
		paletteContainer.add(createDecision2CreationTool());
		paletteContainer.add(createFinish3CreationTool());
		paletteContainer.add(createFork4CreationTool());
		paletteContainer.add(createGlobalPerformanceConstraint5CreationTool());
		paletteContainer.add(createJoin6CreationTool());
		paletteContainer.add(createLocalPerformanceConstraint7CreationTool());
		paletteContainer.add(createObjectNode8CreationTool());
		paletteContainer.add(createStart9CreationTool());
		paletteContainer.add(createStructuredActivityNode10CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				serviceProcess.diagram.part.Messages.Connections2Group_title);
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Action1CreationTool_title,
				serviceProcess.diagram.part.Messages.Action1CreationTool_desc,
				types);
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecision2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Decision2CreationTool_title,
				serviceProcess.diagram.part.Messages.Decision2CreationTool_desc,
				types);
		entry.setId("createDecision2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinish3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Finish3CreationTool_title,
				serviceProcess.diagram.part.Messages.Finish3CreationTool_desc,
				types);
		entry.setId("createFinish3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Fork4CreationTool_title,
				serviceProcess.diagram.part.Messages.Fork4CreationTool_desc,
				types);
		entry.setId("createFork4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlobalPerformanceConstraint5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.GlobalPerformanceConstraint5CreationTool_title,
				serviceProcess.diagram.part.Messages.GlobalPerformanceConstraint5CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.PerformanceAnnotation_2009));
		entry.setId("createGlobalPerformanceConstraint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.PerformanceAnnotation_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Join6CreationTool_title,
				serviceProcess.diagram.part.Messages.Join6CreationTool_desc,
				types);
		entry.setId("createJoin6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocalPerformanceConstraint7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.LocalPerformanceConstraint7CreationTool_title,
				serviceProcess.diagram.part.Messages.LocalPerformanceConstraint7CreationTool_desc,
				types);
		entry.setId("createLocalPerformanceConstraint7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectNode8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.ObjectNode8CreationTool_title,
				serviceProcess.diagram.part.Messages.ObjectNode8CreationTool_desc,
				types);
		entry.setId("createObjectNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStart9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Start9CreationTool_title,
				serviceProcess.diagram.part.Messages.Start9CreationTool_desc,
				types);
		entry.setId("createStart9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredActivityNode10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.StructuredActivityNode10CreationTool_title,
				serviceProcess.diagram.part.Messages.StructuredActivityNode10CreationTool_desc,
				types);
		entry.setId("createStructuredActivityNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlFlow1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceProcess.diagram.part.Messages.ControlFlow1CreationTool_title,
				serviceProcess.diagram.part.Messages.ControlFlow1CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001));
		entry.setId("createControlFlow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkPerformanceAnnotation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceProcess.diagram.part.Messages.LinkPerformanceAnnotation2CreationTool_title,
				serviceProcess.diagram.part.Messages.LinkPerformanceAnnotation2CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003));
		entry.setId("createLinkPerformanceAnnotation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectFlow3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceProcess.diagram.part.Messages.ObjectFlow3CreationTool_title,
				serviceProcess.diagram.part.Messages.ObjectFlow3CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002));
		entry.setId("createObjectFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002));
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
