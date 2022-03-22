package es.uca.webservices.wsdl.emf.ui.dialogs;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SaveAsDialog;

/**
 * Dialog that provides a field for entering the URL of the WSDL
 * document from which the ServiceAnalyzer catalog should be generated,
 * and another field for entering the file to which it should be saved.
 *
 * @author Antonio García-Domínguez
 */
public class GenerateCatalogFromURLDialog extends TitleAreaDialog {

	private final class BrowseFileListener extends SelectionAdapter {
		private final Text txtFile;

		private BrowseFileListener(Text txtFile) {
			this.txtFile = txtFile;
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			SaveAsDialog dialog = new SaveAsDialog(getShell());
			if (targetIFile != null) {
				dialog.setOriginalFile(targetIFile);
			}
			else {
				dialog.setOriginalName("generated.msgcat");
			}

			if (dialog.open() == Window.OK) {
				final IPath path = dialog.getResult();
				targetIFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				txtFile.setText(path.toString());
				validate();
			}
		}
	}

	private String sSourceURL;
	private IFile targetIFile;

	public GenerateCatalogFromURLDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Create ServiceAnalyzer catalog from URL");
		setMessage("Please specify the URL to the WSDL document and the target location for the catalog.");
	}

	public String getSourceURL() {
		return sSourceURL;
	}

	public IFile getTargetIFile() {
		return targetIFile;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(600, 230);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite dialogArea = (Composite)super.createDialogArea(parent);

		final Composite inner = createInnerContainer(dialogArea);
		createURLTextField(inner);
		createTargetFileField(inner);

		return dialogArea;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		validate();
	}

	private Composite createInnerContainer(final Composite dialogArea) {
		final Composite inner = new Composite(dialogArea, SWT.FILL);
		final GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		inner.setLayout(layout);
		inner.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return inner;
	}

	private void createURLTextField(final Composite inner) {
		final Label lblURL = new Label(inner, SWT.NONE);
		lblURL.setText("&URL:");
	
		final Text txtURL = new Text(inner, SWT.BORDER);
		GridData txtURLLayoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		txtURLLayoutData.horizontalSpan = 2;
		txtURL.setLayoutData(txtURLLayoutData);
	
		txtURL.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				sSourceURL = txtURL.getText();
				validate();
			}
		});
	}

	private void createTargetFileField(final Composite inner) {
		final Label lblFile = new Label(inner, SWT.NONE);
		lblFile.setText("Target &file:");

		final Text txtFile = new Text(inner, SWT.BORDER);
		txtFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtFile.setEditable(false);

		Button btnBrowse = new Button(inner, SWT.BORDER);
		btnBrowse.setText("&Browse...");
		btnBrowse.addSelectionListener(new BrowseFileListener(txtFile));
	}

	private void validate() {
		boolean valid = true;
		setErrorMessage(null);
		
		if (targetIFile == null) {
			valid = false;
			setErrorMessage("No target file has been selected");
		}
		else if (sSourceURL == null || sSourceURL.trim().length() == 0) {
			valid = false;
			setErrorMessage("No source URL has been set");
		}
		else {
			try {
				final URL sourceURL = new URL(sSourceURL);
				if (sourceURL.getHost() == null || sourceURL.getHost().length() == 0) {
					valid = false;
					setErrorMessage("Specified URL does not have a host part");
				}
			} catch (MalformedURLException e) {
				valid = false;
				setErrorMessage("Specified URL is not valid");
			}
		}

		final Button btnOK = this.getButton(IDialogConstants.OK_ID);
		btnOK.setEnabled(valid);
	}
}
