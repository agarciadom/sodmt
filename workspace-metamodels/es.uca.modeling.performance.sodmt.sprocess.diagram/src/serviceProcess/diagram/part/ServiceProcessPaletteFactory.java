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
		paletteContainer.add(createFinalNode3CreationTool());
		paletteContainer.add(createFork4CreationTool());
		paletteContainer.add(createGlobalPerformanceConstraint5CreationTool());
		paletteContainer.add(createInitialNode6CreationTool());
		paletteContainer.add(createJoin7CreationTool());
		paletteContainer.add(createLocalPerformanceConstraint8CreationTool());
		paletteContainer.add(createObjectNode9CreationTool());
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
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3018);
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
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Decision2CreationTool_title,
				serviceProcess.diagram.part.Messages.Decision2CreationTool_desc,
				types);
		entry.setId("createDecision2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalNode3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.FinalNode3CreationTool_title,
				serviceProcess.diagram.part.Messages.FinalNode3CreationTool_desc,
				types);
		entry.setId("createFinalNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Fork4CreationTool_title,
				serviceProcess.diagram.part.Messages.Fork4CreationTool_desc,
				types);
		entry.setId("createFork4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025));
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
	private ToolEntry createInitialNode6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.InitialNode6CreationTool_title,
				serviceProcess.diagram.part.Messages.InitialNode6CreationTool_desc,
				types);
		entry.setId("createInitialNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Join7CreationTool_title,
				serviceProcess.diagram.part.Messages.Join7CreationTool_desc,
				types);
		entry.setId("createJoin7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocalPerformanceConstraint8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.LocalPerformanceConstraint8CreationTool_title,
				serviceProcess.diagram.part.Messages.LocalPerformanceConstraint8CreationTool_desc,
				types);
		entry.setId("createLocalPerformanceConstraint8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectNode9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.ObjectNode9CreationTool_title,
				serviceProcess.diagram.part.Messages.ObjectNode9CreationTool_desc,
				types);
		entry.setId("createObjectNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredActivityNode10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019);
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
