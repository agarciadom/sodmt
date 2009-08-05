package figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;

/*
 * Black-filled rectangle for fork and join nodes.
 * 
 * @author Antonio García Domínguez
 * @version 1.0
 * */
public class ForkJoinNodeFigure extends Figure {

	@Override
	public void paintFigure(Graphics g) {
		g.setBackgroundColor(ColorConstants.black);
		g.fillRectangle(getBounds());
	}

}
