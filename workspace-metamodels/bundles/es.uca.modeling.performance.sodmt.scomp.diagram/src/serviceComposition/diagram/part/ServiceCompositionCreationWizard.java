/*
 * 
 */
package serviceComposition.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ServiceCompositionCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected serviceComposition.diagram.part.ServiceCompositionCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected serviceComposition.diagram.part.ServiceCompositionCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizardTitle);
		setDefaultPageImageDescriptor(serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewServiceCompositionWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new serviceComposition.diagram.part.ServiceCompositionCreationWizardPage(
				"DiagramModelFile", getSelection(), "scdiag"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(
				serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new serviceComposition.diagram.part.ServiceCompositionCreationWizardPage(
				"DomainModelFile", getSelection(), "sc") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".scdiag".length()); //$NON-NLS-1$
					setFileName(serviceComposition.diagram.part.ServiceCompositionDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "sc")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(
				serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = serviceComposition.diagram.part.ServiceCompositionDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						serviceComposition.diagram.part.ServiceCompositionDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						serviceComposition.diagram.part.Messages.ServiceCompositionCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
