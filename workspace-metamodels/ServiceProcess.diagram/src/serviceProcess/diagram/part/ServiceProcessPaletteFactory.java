/*
 * 
 */
package serviceProcess.diagram.part;

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
		paletteContainer.add(createDecision1CreationTool());
		paletteContainer.add(createFinish2CreationTool());
		paletteContainer.add(createFork3CreationTool());
		paletteContainer.add(createJoin4CreationTool());
		paletteContainer.add(createServiceActivity5CreationTool());
		paletteContainer
				.add(createServiceActivityPerformanceConstraint6CreationTool());
		paletteContainer
				.add(createServiceProcessPerformanceConstraint7CreationTool());
		paletteContainer.add(createStart8CreationTool());
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
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecision1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Decision1CreationTool_title,
				serviceProcess.diagram.part.Messages.Decision1CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessDecision_2022));
		entry.setId("createDecision1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessDecision_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinish2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Finish2CreationTool_title,
				serviceProcess.diagram.part.Messages.Finish2CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFinish_2021));
		entry.setId("createFinish2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFinish_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Fork3CreationTool_title,
				serviceProcess.diagram.part.Messages.Fork3CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFork_2023));
		entry.setId("createFork3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFork_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Join4CreationTool_title,
				serviceProcess.diagram.part.Messages.Join4CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessJoin_2024));
		entry.setId("createJoin4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessJoin_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceActivity5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.ServiceActivity5CreationTool_title,
				serviceProcess.diagram.part.Messages.ServiceActivity5CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivity_2019));
		entry.setId("createServiceActivity5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivity_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceActivityPerformanceConstraint6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.ServiceActivityPerformanceConstraint6CreationTool_title,
				serviceProcess.diagram.part.Messages.ServiceActivityPerformanceConstraint6CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ActivityPerformanceAnnotation_2017));
		entry.setId("createServiceActivityPerformanceConstraint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ActivityPerformanceAnnotation_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceProcessPerformanceConstraint7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.ServiceProcessPerformanceConstraint7CreationTool_title,
				serviceProcess.diagram.part.Messages.ServiceProcessPerformanceConstraint7CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessPerformanceAnnotation_2018));
		entry.setId("createServiceProcessPerformanceConstraint7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessPerformanceAnnotation_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStart8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				serviceProcess.diagram.part.Messages.Start8CreationTool_title,
				serviceProcess.diagram.part.Messages.Start8CreationTool_desc,
				Collections
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessStart_2020));
		entry.setId("createStart8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessStart_2020));
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
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005));
		entry.setId("createControlFlow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005));
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
						.singletonList(serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivityAnnotation_4008));
		entry.setId("createLinkPerformanceAnnotation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(serviceProcess.diagram.providers.ServiceProcessElementTypes
				.getImageDescriptor(serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivityAnnotation_4008));
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
