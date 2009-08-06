package figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;

/*
 * Filled black circle for the final node in a service process diagram. 
 * 
 * @author Antonio García Domínguez
 * @version 1.0
 * */
public class FinalNodeFigure extends Figure {

	@Override
	public void paintFigure(Graphics g) {
		g.setBackgroundColor(g.getForegroundColor());
		g.fillOval(getBounds());
	}

}
