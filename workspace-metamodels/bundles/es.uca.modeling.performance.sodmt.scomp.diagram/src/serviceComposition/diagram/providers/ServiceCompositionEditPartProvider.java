/*
 * 
 */
package serviceComposition.diagram.providers;

import java.lang.ref.WeakReference;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class ServiceCompositionEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ServiceCompositionEditPartProvider() {
		super(new serviceComposition.diagram.edit.parts.ServiceCompositionEditPartFactory(),
				serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.TYPED_INSTANCE,
				serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID);
	}
}
