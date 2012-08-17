/*
 * 
 */
package serviceComposition.diagram.part;

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
		paletteContainer.add(createActionPerformanceConstraint1CreationTool());
		paletteContainer.add(createActivityAction2CreationTool());
		paletteContainer.add(createActivityDecision3CreationTool());
		paletteContainer.add(createActivityFinish4CreationTool());
		paletteContainer.add(createActivityFork5CreationTool());
		paletteContainer.add(createActivityJoin6CreationTool());
		paletteContainer.add(createActivityObjectNode7CreationTool());
		paletteContainer.add(createActivityStart8CreationTool());
		paletteContainer.add(createCompositionDecision9CreationTool());
		paletteContainer.add(createCompositionFinish10CreationTool());
		paletteContainer.add(createCompositionFork11CreationTool());
		paletteContainer.add(createCompositionJoin12CreationTool());
		paletteContainer.add(createCompositionObjectNode13CreationTool());
		paletteContainer.add(createCompositionStart14CreationTool());
		paletteContainer.add(createServiceActivity15CreationTool());
		paletteContainer
				.add(createServiceActivityPerformanceConstraint16CreationTool());
		paletteContainer.add(createSwimlanes17CreationTool());
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
		paletteContainer.add(createActivityControlFlow1CreationTool());
		paletteContainer.add(createActivityObjectFlow2CreationTool());
		paletteContainer.add(createCompositionControlFlow3CreationTool());
		paletteContainer.add(createCompositionObjectFlow4CreationTool());
		paletteContainer
				.add(createLinkActionPerformanceAnnotation5CreationTool());
		paletteContainer
				.add(createLinkActivityPerformanceAnnotation6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionPerformanceConstraint1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActionPerformanceConstraint1CreationTool_title,
				serviceComposition.diagram.part.Messages.ActionPerformanceConstraint1CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActionPerformanceAnnotation_3007));
		entry.setId("createActionPerformanceConstraint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActionPerformanceAnnotation_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityAction2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityAction2CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityAction2CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityAction_3001));
		entry.setId("createActivityAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityAction_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityDecision3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityDecision3CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityDecision3CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityDecision_3004));
		entry.setId("createActivityDecision3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityDecision_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinish4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityFinish4CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityFinish4CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFinish_3003));
		entry.setId("createActivityFinish4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFinish_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFork5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityFork5CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityFork5CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFork_3005));
		entry.setId("createActivityFork5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFork_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityJoin6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityJoin6CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityJoin6CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityJoin_3006));
		entry.setId("createActivityJoin6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityJoin_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityObjectNode7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityObjectNode7CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityObjectNode7CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectNode_3008));
		entry.setId("createActivityObjectNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectNode_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityStart8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ActivityStart8CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityStart8CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityStart_3002));
		entry.setId("createActivityStart8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityStart_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionDecision9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.CompositionDecision9CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionDecision9CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionDecision_2025));
		entry.setId("createCompositionDecision9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionDecision_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionFinish10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.CompositionFinish10CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionFinish10CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFinish_2024));
		entry.setId("createCompositionFinish10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFinish_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionFork11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.CompositionFork11CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionFork11CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFork_2026));
		entry.setId("createCompositionFork11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFork_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionJoin12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.CompositionJoin12CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionJoin12CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionJoin_2027));
		entry.setId("createCompositionJoin12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionJoin_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionObjectNode13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.CompositionObjectNode13CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionObjectNode13CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectNode_2031));
		entry.setId("createCompositionObjectNode13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectNode_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionStart14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.CompositionStart14CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionStart14CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionStart_2023));
		entry.setId("createCompositionStart14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionStart_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceActivity15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ServiceActivity15CreationTool_title,
				serviceComposition.diagram.part.Messages.ServiceActivity15CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022));
		entry.setId("createServiceActivity15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceActivityPerformanceConstraint16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.ServiceActivityPerformanceConstraint16CreationTool_title,
				serviceComposition.diagram.part.Messages.ServiceActivityPerformanceConstraint16CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPerformanceAnnotation_2028));
		entry.setId("createServiceActivityPerformanceConstraint16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPerformanceAnnotation_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwimlanes17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceComposition.diagram.part.Messages.Swimlanes17CreationTool_title,
				serviceComposition.diagram.part.Messages.Swimlanes17CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.SwimlaneContainer_2030));
		entry.setId("createSwimlanes17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.SwimlaneContainer_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityControlFlow1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.ActivityControlFlow1CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityControlFlow1CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011));
		entry.setId("createActivityControlFlow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityObjectFlow2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.ActivityObjectFlow2CreationTool_title,
				serviceComposition.diagram.part.Messages.ActivityObjectFlow2CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012));
		entry.setId("createActivityObjectFlow2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionControlFlow3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.CompositionControlFlow3CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionControlFlow3CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007));
		entry.setId("createCompositionControlFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositionObjectFlow4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.CompositionObjectFlow4CreationTool_title,
				serviceComposition.diagram.part.Messages.CompositionObjectFlow4CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015));
		entry.setId("createCompositionObjectFlow4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkActionPerformanceAnnotation5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.LinkActionPerformanceAnnotation5CreationTool_title,
				serviceComposition.diagram.part.Messages.LinkActionPerformanceAnnotation5CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityActionAnnotation_4008));
		entry.setId("createLinkActionPerformanceAnnotation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityActionAnnotation_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkActivityPerformanceAnnotation6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				serviceComposition.diagram.part.Messages.LinkActivityPerformanceAnnotation6CreationTool_title,
				serviceComposition.diagram.part.Messages.LinkActivityPerformanceAnnotation6CreationTool_desc,
				Collections
						.singletonList(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014));
		entry.setId("createLinkActivityPerformanceAnnotation6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceComposition.diagram.providers.ServiceCompositionElementTypes
				.getImageDescriptor(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014));
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
