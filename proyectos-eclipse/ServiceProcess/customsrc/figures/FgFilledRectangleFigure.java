package figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;

/*
 * Rectangle filled with the foreground color.
 * Useful for fork and join nodes.
 * 
 * @author Antonio García Domínguez
 * @version 1.0
 * */
public class FgFilledRectangleFigure extends Figure {

	@Override
	public void paintFigure(Graphics g) {
		g.setBackgroundColor(g.getForegroundColor());
		g.fillRectangle(getBounds());
	}

}
