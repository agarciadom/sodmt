package serviceComposition.diagram.borders;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;

/**
 * Custom border which only draws the left edge.
 *
 * @author Antonio García-Domínguez
 */
public class LeftBorder extends LineBorder {
	@Override
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));

		graphics.setLineWidth(getWidth());
		graphics.setLineStyle(getStyle());
		if (getColor() != null)
			graphics.setForegroundColor(getColor());

		graphics.drawLine(tempRect.getBottomLeft(), tempRect.getTopLeft());
	}
}
