package es.uca.modeling.papyrus.utils.handlers;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import es.uca.modeling.papyrus.utils.Activator;

/**
 * Command handler that duplicates a .di/.notation/.uml triplet into another one,
 * while rewriting their cross references so they reference the duplicates (Papyrus
 * doesn't do that).
 *
 * @author Antonio García-Domínguez
 */
public class DefaultDuplicateHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		
		if (sel instanceof IStructuredSelection) {
			final IStructuredSelection ssel = (IStructuredSelection)sel;
			final Object first = ssel.getFirstElement();
			
			if (first instanceof IPapyrusFile) {
				final Shell shell = HandlerUtil.getActiveShell(event);
				try {
					process(shell, (IPapyrusFile)first);
				} catch (Exception e) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
									Activator.EXCEPTION_DUPLICATE,
									"Error while duplicating Papyrus file", e));
				}
			}
		}

		return null;
	}

	private void process(final Shell shell, final IPapyrusFile file) throws Exception {
		final Map<IResource, IResource> sourceToTarget = obtainMappings(shell, file);
		if (sourceToTarget.isEmpty()) {
			return;
		}

		// Prepare XML parser
		final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);

		// Prepare canned XPath expression for finding all hrefs
		final XPathExpression findAllHrefs = XPathFactory.newInstance().newXPath().compile("//@href");

		// Prepare identity XSLT transform for saving files
		final Transformer idTransform = TransformerFactory.newInstance().newTransformer();

		// Copy and update resources
		final Map<Pattern, String> regexps = computeReplacementRegexps(sourceToTarget);
		for (Map.Entry<IResource, IResource> entry : sourceToTarget.entrySet()) {
			final IResource source = entry.getKey();
			final IResource target = entry.getValue();
			source.copy(target.getFullPath(), true, null);

			final File targetFile = target.getLocation().toFile();
			final Document doc = dbf.newDocumentBuilder().parse(targetFile);
			final NodeList hrefs = (NodeList)findAllHrefs.evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < hrefs.getLength(); i++) {
				final Attr attr = (Attr)hrefs.item(i);

				String value = attr.getValue();
				for (Map.Entry<Pattern, String> regexEntries : regexps.entrySet()) {
					final Pattern regex = regexEntries.getKey();
					final String replacement = regexEntries.getValue();
					value = regex.matcher(value).replaceAll(replacement);
				}

				attr.setValue(value);
			}
 
			idTransform.transform(new DOMSource(doc), new StreamResult(targetFile));
		}
	}

	private Map<Pattern, String> computeReplacementRegexps(
			final Map<IResource, IResource> sourceToTarget) {
		final Map<Pattern, String> regexps = new HashMap<Pattern, String>();
		for (Map.Entry<IResource, IResource> entry : sourceToTarget.entrySet()) {
			final Pattern p = Pattern.compile("\\b" + entry.getKey().getName() + "(?=#)");
			regexps.put(p, entry.getValue().getName());
		}
		return regexps;
	}

	private Map<IResource, IResource> obtainMappings(final Shell shell, final IPapyrusFile file) {
		final Set<String> resources = new HashSet<String>();
		for (final IResource r : file.getAssociatedResources()) {
			resources.add(r.getName());
		}

		final Map<IResource, IResource> sourceToTarget = new HashMap<IResource, IResource>();
		for (IResource r : file.getAssociatedResources()) {
			final String rName = r.getName();

			// Keep on trying until the user presses Cancel or we get it right
			IResource newResource = null;
			while (newResource == null) {
				final String newName = prompt(shell, "Duplicate Papyrus file", String.format("New name for %s", rName), "copy-" + rName);
				if (newName == null) {
					return Collections.emptyMap();
				}
				else if (resources.contains(newName)) {
					MessageDialog.openError(shell,
						"Error while creating duplicates: cannot overwrite originals",
						String.format("%s is one of the resources to be duplicated. Please pick a different name.", newName));
				}
				else {
					newResource = r.getParent().getFile(new Path(newName));
					if (sourceToTarget.values().contains(newResource)) {
						MessageDialog.openError(shell,
							"Error while creating duplicates: name already used",
							String.format("%s has already been used. Please pick a different name.", newName));
						newResource = null;
					}
				}
			}

			sourceToTarget.put(r, newResource);
		}

		return sourceToTarget;
	}

	private String prompt(final Shell shell, String title, String question, String initial) {
		InputDialog dialog = new InputDialog(shell, title, question, initial, null);
		if (dialog.open() == Window.OK) {
			return dialog.getValue();
		}
		else {
			return null;
		}
	}

}
