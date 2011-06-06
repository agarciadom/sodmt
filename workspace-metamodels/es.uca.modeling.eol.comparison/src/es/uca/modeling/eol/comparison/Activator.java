package es.uca.modeling.eol.comparison;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import es.uca.modeling.eol.comparison.cases.DenseCaseStudy;
import es.uca.modeling.eol.comparison.cases.DipoleSequenceCaseStudy;
import es.uca.modeling.eol.comparison.cases.SequenceCaseStudy;
import es.uca.modeling.eol.comparison.model.CaseStudyRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "es.uca.modeling.eol.comparison"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private CaseStudyRegistry fRegistry;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		fRegistry = new CaseStudyRegistry();
		fRegistry.register(new SequenceCaseStudy());
		fRegistry.register(new DenseCaseStudy());
		fRegistry.register(new DipoleSequenceCaseStudy());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * Returns the case study registry for this plugin.
	 */
	public CaseStudyRegistry getRegistry() {
		return fRegistry;
	}
}
