package es.uca.modeling.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class LabeledEllipse extends Ellipse {

  @Override
  public void paintFigure(Graphics g) {
    super.paintFigure(g);

    // Wrap the whole text over the ellipse
    WrappingLabel label = (WrappingLabel) getChildren().get(0);
    label.setTextWrap(true);
    label.setAlignment(PositionConstants.CENTER);
    label.setTextJustification(PositionConstants.CENTER);
    label.setBounds(getBounds());
    label.paint(g);
  }

}
