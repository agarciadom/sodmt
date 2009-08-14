package es.uca.modeling.ant.emfatic;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.emfatic.core.generator.ecore.EcoreGenerator;

/*
 * Ant wrapper over the EcoreGenerator class part of Emfatic. Requires Eclipse
 * to run, as the EcoreGenerator#generate expects an IFile.
 * 
 *  @see org.eclipse.emf.emfatic.core.generator.ecore.EcoreGenerator#generate
 *  @author Antonio García Domínguez
 *  @version 1.0
 * */
public class EmfaticEcoreGeneratorTask extends Task {
	private File file;

	public void setSrc(File path) {
		this.file = path;
	}

	public File getSrc() {
		return file;
	}

	@Override
	public void execute() throws BuildException {
		if (file == null) {
			throw new BuildException("src attribute must be set");
		}
		IFile emfFile
		  = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(file.getAbsolutePath()));
		EcoreGenerator gen = new EcoreGenerator();
		gen.generate(emfFile, null);
	}
}
