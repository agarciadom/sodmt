package es.uca.modeling.eol.contextmenu.popup.actions;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Action which runs an ETL transformation to map a ServiceProcess model to a
 * ServiceComposition model. The original model should be completely annotated
 * (using the existing EWL wizards) and should pass the EVL validation with no
 * errors.
 * 
 * @author Antonio García Domínguez
 * @version 1.0
 * */
public class MapToServiceCompositionAction implements IObjectActionDelegate {

  private static final String
    SCOMPOSITION_EXTENSION = "servicecomposition";
  private final static String
    ETL_SCRIPT = "SProcessModelToSCompositionModel.etl";
  private final static String
    SPROCESS_METAMODEL_URI = "www.uca.es/modeling/serviceProcess";
  private final static String
    SCOMPOSITION_METAMODEL_URI = "www.uca.es/modeling/serviceComposition";

  private Shell shell;

  private IFile currentSelection;

  /**
   * Constructor for Action1.
   */
  public MapToServiceCompositionAction() {
    super();
  }

  private EmfModel createEmfModel(String name, String model, String metamodel,
      boolean readOnLoad, boolean storeOnDisposal)
      throws EolModelLoadingException, URISyntaxException {
    EmfModel emfModel = new EmfModel();
    StringProperties properties = new StringProperties();
    properties.put(Model.PROPERTY_NAME, name);
    properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
    properties.put(EmfModel.PROPERTY_MODEL_FILE, "file:/" + new File(model).getAbsolutePath());
    properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
    properties.put(Model.PROPERTY_READONLOAD, readOnLoad + "");
    properties.put(Model.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
    emfModel.load(properties, null);
    return emfModel;
  }

  /**
   * @see IActionDelegate#run(IAction)
   */
  public void run(IAction action) {
    try {
      // We need the path to the current selection and the destination
      if (currentSelection == null) {
        MessageDialog.openError(shell, "Error in invoking mapping",
            "No source model has been selected");
        return;
      }
      final String pathSProcess = currentSelection.getLocation().toString();
      final String pathSComposition = computeDestinationPath();
      
      // Make sure that the destination file exists
      final File destinationFile = new File(pathSComposition); 
      if (!destinationFile.exists() && !destinationFile.createNewFile()) {
        MessageDialog.openError(shell, "Error in invoking mapping",
            String.format(
                "Could not create the destination path: %s",
                pathSComposition));
      }

      // Run the ETL transformation and show any problems to the user
      final EtlModule etlScript
        = runTransformation(pathSProcess, pathSComposition);
      showProblemsIfAny(etlScript);
      etlScript.getContext().getModelRepository().dispose();

      // Refresh the list of files in the navigator
      currentSelection.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
    } catch (Exception e) {
      MessageDialog.openError(shell,
          "Error during mapping to Service Composition", e
              .getLocalizedMessage());
    }
  }

  private String computeDestinationPath() {
    final String selName = currentSelection.getName();
    final String selBasename = (selName.indexOf('.') != -1) ?
        selName.substring(0, selName.lastIndexOf('.')) : selName;
    String pathToServiceComposition = currentSelection.getParent().getLocation()
        + File.separator + selBasename + "." + SCOMPOSITION_EXTENSION;
    return pathToServiceComposition;
  }

  private EtlModule runTransformation(String pathToServiceProcess, String pathToServiceComposition)
      throws URISyntaxException, EolModelLoadingException, Exception {

    // Create a new ETL script object, initially empty
    final URI uriEtl = MapToServiceCompositionAction.class.getResource(ETL_SCRIPT).toURI();
    final EtlModule etlScript = new EtlModule();

    // Add the source and target models to the model repository
    final ModelRepository modelRepo = etlScript.getContext()
        .getModelRepository();
    modelRepo.addModel(createEmfModel("Source", pathToServiceProcess,
        SPROCESS_METAMODEL_URI, true, false));
    modelRepo.addModel(createEmfModel("Target", pathToServiceComposition,
        SCOMPOSITION_METAMODEL_URI, false, true));

    // Run the ETL transformation
    etlScript.parse(uriEtl);
    etlScript.execute();
    return etlScript;
  }

  /**
   * @see IActionDelegate#selectionChanged(IAction, ISelection)
   */
  public void selectionChanged(IAction action, ISelection selection) {
    currentSelection = null;
    if (selection instanceof TreeSelection) {
      final TreeSelection treeSel = (TreeSelection) selection;
      final IAdaptable adaptableSel = (IAdaptable) treeSel.getFirstElement();
      final IFile fileSel = (IFile) adaptableSel.getAdapter(IFile.class);
      if (fileSel != null && fileSel.isAccessible()) {
        currentSelection = fileSel;
      }
    }
  }

  /**
   * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
   */
  public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    shell = targetPart.getSite().getShell();
  }

  private void showProblemsDialog(final List<ParseProblem> problems) {
    final StringBuffer problemText = new StringBuffer();
    for (ParseProblem problem : problems) {
      problemText.append(String.format("Line %d, column %d: %s\n", problem
          .getLine(), problem.getColumn(), problem.getReason()));
    }
    MessageDialog.openError(shell,
        "Error during mapping to Service Composition",
        "There were the following parse problems in the ETL script:\n"
            + problemText.toString());
  }

  private void showProblemsIfAny(final EtlModule etlScript) {
    final List<ParseProblem> problems = etlScript.getParseProblems();
    if (!problems.isEmpty()) {
      showProblemsDialog(problems);
    }
  }

}
