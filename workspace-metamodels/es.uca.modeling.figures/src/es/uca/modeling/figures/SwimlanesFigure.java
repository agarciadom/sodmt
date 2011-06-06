package es.uca.modeling.figures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.ImageUtilities;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

/**
 * <p>Figure which draws a series of horizontal swimlanes with the same vertical
 * size. If no swimlanes have been specified, acts as if two swimlanes called
 * "swimlane A" and "swimlane B" had been defined.</p>
 *
 * <p>Swimlanes can be modified by using the {@link #clearSwimlines},
 * {@link #removeSwimline} and {@link #addSwimline} methods.</p>
 *
 *  @author Antonio García Domínguez
 *  @version 1.0
 */
public class SwimlanesFigure extends Figure {

        final private int LINE_WIDTH = 2;
        final private int LABEL_COLUMN_WIDTH = 30;
        final private List<String> swimlanes = new ArrayList<String>();

        @Override
        public void paint(Graphics g) {
                g.setLineWidth(LINE_WIDTH);

                // If no swimlanes were specified, draw a default set of swimlanes
                List<String> drawnSwimlanes = this.swimlanes;
                if (drawnSwimlanes.isEmpty()) {
                        drawnSwimlanes = new ArrayList<String>();
                        drawnSwimlanes.add("swimlane A");
                        drawnSwimlanes.add("swimlane B");
                }

                final Rectangle rWhole = getBounds();
                final int nParts = drawnSwimlanes.size();
                final int partHeight = rWhole.height / nParts;
                final Rectangle rPart = rWhole.getCopy();
                rPart.height = partHeight;

                for (int i = 0; i < nParts; ++i) {
                        Rectangle rLabels = rPart.getCopy();
                        rLabels.width = LABEL_COLUMN_WIDTH;
                        g.drawRectangle(rPart);
                        g.drawRectangle(rLabels);

                        Image imgText = ImageUtilities.createRotatedImageOfString(
                                        drawnSwimlanes.get(i), g.getFont(),
                                        g.getForegroundColor(), g.getBackgroundColor());
                        g.drawImage(imgText,
                                        rLabels.x + 10,
                                        rLabels.y + rLabels.height/2 - imgText.getBounds().height/2);

                        rPart.y += partHeight;
                }
        }

        public void clearSwimlanes() {
                swimlanes.clear();
        }

        public void addSwimlane(String s) {
                swimlanes.add(s);
        }

        public void removeSwimlane(String s) {
                swimlanes.remove(s);
        }
}
