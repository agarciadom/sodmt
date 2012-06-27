package es.uca.modeling.eol.marte.codegen.modisco.handlers;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromProject;
import org.eclipse.ui.handlers.HandlerUtil;

public class AnalyzeJavaProjectHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {
			final IStructuredSelection ssel = (IStructuredSelection)sel;
			final Object first = ssel.getFirstElement();

			try {
				if (first instanceof IProject) {
					analyze((IProject) first);
				} else if (first instanceof IJavaProject) {
					analyze((IJavaProject) first);
				}
			} catch (Exception ex) {
				throw new ExecutionException("Exception while discovering model from Java project", ex);
			}
		}

		return null;
	}

	private void analyze(IJavaProject source) throws DiscoveryException, IOException, CoreException {
		final IProject project = (IProject)source.getResource();
		final URI modelURI = computeModelURI(project);
		
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		discoverer.setSerializeTarget(true);
		discoverer.setTargetURI(modelURI);
		discoverer.discoverElement(source, new NullProgressMonitor());

		project.refreshLocal(IProject.DEPTH_INFINITE,  new NullProgressMonitor());
	}

	private void analyze(IProject source) throws IOException, DiscoveryException, CoreException {
		final URI modelURI = computeModelURI(source);

		DiscoverJavaModelFromProject discoverer = new DiscoverJavaModelFromProject();
		discoverer.setSerializeTarget(true);
		discoverer.setTargetURI(modelURI);
		discoverer.discoverElement(source, new NullProgressMonitor());

		source.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
	}

	private URI computeModelURI(IProject project) throws IOException {
		final File fProjectDir = new File(project.getLocationURI());
		final File fModelFile = new File(fProjectDir, fProjectDir.getName() + ".javaxmi");
		return URI.createFileURI(fModelFile.getCanonicalPath());
	}
}
