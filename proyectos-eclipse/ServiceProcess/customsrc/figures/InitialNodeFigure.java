package figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/*
 * Figure for the initial node in a service process. It's 
 * 
 * @author Antonio García Domínguez
 * @version 1.0
 * */
public class InitialNodeFigure extends Figure {

	private final static int LINE_WIDTH = 2;
	private final static double RADIUS_INNER_RATIO = 0.7;

	@Override
	public void paintFigure(Graphics g) {
		Rectangle r = getBounds().getCopy();
		r.x += LINE_WIDTH;
		r.y += LINE_WIDTH;
		r.width -= LINE_WIDTH*2;
		r.height -= LINE_WIDTH*2;

		g.fillOval(r);
		g.setLineWidth(LINE_WIDTH);
		g.drawOval(r);

		final int innerDiameter = (int) Math.floor(r.width * RADIUS_INNER_RATIO);
		r.x += (r.width  - innerDiameter)/2;
		r.y += (r.height - innerDiameter)/2;
		r.width = r.height = innerDiameter;
		g.setBackgroundColor(g.getForegroundColor());
		g.fillOval(r);
	}

}
