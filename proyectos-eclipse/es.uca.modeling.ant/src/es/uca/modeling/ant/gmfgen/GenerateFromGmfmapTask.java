package es.uca.modeling.ant.gmfgen;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.bridge.transform.TransformToGenModelOperation;

/*
 * Task which generates the GMFGen model from the GMFMap model.
 * 
 * Note: this task requires the Eclipse runtime NOT to be in strict mode, or
 * access restrictions to org.eclipse.gmf.internal.bridge.transform will kick
 * in and prevent this task from working.
 * 
 * @see org.eclipse.gmf.internal.bridge.transform.TransformToGenModelOperation
 * @see org.eclipse.gmf.internal.bridge.transform.TransformToGenModelWizard
 * @author Antonio García Domínguez
 * @version 1.0
 * */
@SuppressWarnings("restriction")
public class GenerateFromGmfmapTask extends Task {

  private String destFile, genModel, mapModel, projectName;

  public void setDestFile(String f) {
    this.destFile = f;
  }

  public String getDestFile() {
    return destFile;
  }

  public void setGenModel(String genModel) {
    this.genModel = genModel;
  }

  public String getGenModel() {
    return genModel;
  }

  public void setMapModel(String mapModel) {
    this.mapModel = mapModel;
  }

  public String getMapModel() {
    return mapModel;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getProjectName() {
    return projectName;
  }
  
  @Override
  public void execute() throws BuildException {
    checkAttributes();

    try {
      final TransformToGenModelOperation op = new TransformToGenModelOperation(
          createResourceSet());
      
      final String pathGenModel = String.format("/%s/%s", getProjectName(), getGenModel());
      final String pathMapModel = String.format("/%s/%s", getProjectName(), getMapModel());
      final String pathGmfgenModel = String.format("/%s/%s", getProjectName(), getDestFile());
      final URI uriGenModel = URI.createPlatformResourceURI(pathGenModel, true);
      final URI uriMapModel = URI.createPlatformResourceURI(pathMapModel, true);
      final URI uriGmfgenModel = URI.createPlatformResourceURI(pathGmfgenModel, true);
      op.loadMappingModel(uriMapModel, null);
      op.loadGenModel(uriGenModel, null);
      op.setGenURI(uriGmfgenModel);
      
      IStatus status = op.executeTransformation(null);
      if (!status.isOK()) {
        if (status.getException() != null) {
          status.getException().printStackTrace();
          throw new BuildException(status.getException());
        }
        else {
          throw new BuildException(status.getMessage());
        }
      }
      if (op.getGMFGenValidationResult().getSeverity() == Diagnostic.ERROR) {
        throw new BuildException("GMFGen model failed validation");
      }
    }
    catch (CoreException e) {
      e.printStackTrace();
      throw new BuildException(e);
    }
  }

  private void checkAttributes() throws BuildException {
    if (destFile == null || genModel == null || mapModel == null || projectName == null) {
      throw new BuildException("destFile, genModel, mapModel and projectName must be all set");
    }
  }

  protected ResourceSet createResourceSet() {
    final ResourceSetImpl rs = new ResourceSetImpl();
    rs.getURIConverter().getURIMap()
        .putAll(EcorePlugin.computePlatformURIMap());
    return rs;
  }
}
