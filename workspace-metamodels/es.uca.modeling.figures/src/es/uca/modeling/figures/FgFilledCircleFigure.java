package es.uca.modeling.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;

/*
 * Circle filled with its foreground color. Useful for
 * the final node in a service process diagram.
 *
 * @author Antonio García Domínguez
 * @version 1.0
 * */
public class FgFilledCircleFigure extends Figure {

  @Override
  public void paintFigure(Graphics g) {
    g.setBackgroundColor(g.getForegroundColor());
    g.fillOval(getBounds());
  }

}
