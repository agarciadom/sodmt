package es.uca.modeling.performance.sodmt.egl.glpk;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.util.StringUtil;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.util.FileUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.dt.launching.EclipseContextManager;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class GLPKInputGen {
	private static final String PATH_TO_EGL = "/egl/generate-glpk-input.egl";

	public void sayHello(serviceProcess.InitialNode node) throws Exception {
		generateGLPKInput(node);
	}

	public void sayHello(serviceComposition.InitialNode node) throws Exception {
		generateGLPKInput(node);
	}

	private void generateGLPKInput(final EObject node) throws Exception {
		final FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
		dialog.setFilterExtensions(new String[]{ "*.model" });
		dialog.setFilterNames(new String[]{ "GLPK models" });
		final String path = dialog.open();
		if (path == null) return;
		final File outputFile = new File(path);
		
		try {
			runEGL(node, loadResourceAsModel(node.eResource()), PATH_TO_EGL, outputFile);

			MessageDialog.openInformation(
					getShell(),
					"GLPK input model generation",
					"GLPK input model successfully generated at "
							+ outputFile.getCanonicalPath());
		} catch (Exception ex) {
			MessageDialog
					.openError(
							getShell(),
							"GLPK input model generation",
							String.format(
									"Failed to generate GLPK input model at '%s'. Please check your Error Log view.",
									outputFile.getCanonicalPath()));

			throw ex;
		}
	}

	private Model loadResourceAsModel(final Resource res)
			throws EolModelLoadingException {
		final Model model = new InMemoryEmfModel(res);

		model.setName("Model");
		model.setStoredOnDisposal(false);
		model.setReadOnLoad(true);
		model.load();

		return model;
	}

	private static void runEGL(EObject node, final Model model, final String pathToEGL,
			final File outputFile) throws Exception {
		// Parse the EGL script
		final EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		final EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.parse(GLPKInputGen.class.getResource(pathToEGL).toURI());

		// Run it
		EclipseContextManager.setup(eglModule.getContext());
		eglModule.getContext().getModelRepository().addModel(model);
		final EolModelElementType eolType = EolModelElementType.forName(node.eClass().getName(), eglModule.getContext());
		eglModule.getContext().getFrameStack().putGlobal(new Variable("selected", node, eolType));

		// Save the result to a file
		final String result = StringUtil.toString(eglModule.execute());
		FileUtil.write(outputFile, result);
	}

	private static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
}
