package figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

// This import makes sure that the indirectly referenced org.eclipse.swt
// bundle is part of the Eclipse project classpath. Do not remove!
import org.eclipse.swt.graphics.Color;

public class DiamondFigure extends Figure {
	
	private final static int LINE_WIDTH = 2; 

  @Override
  public void paint(Graphics graphics) {
    Rectangle r = getBounds().getCopy();
    
    r.x += LINE_WIDTH;
    r.y += LINE_WIDTH;
    r.width  -= LINE_WIDTH;
    r.height -= LINE_WIDTH;

    // Define the points of a diamond
    Point p1 = new Point(r.x + 1, r.y + r.height/2);
    Point p2 = new Point(r.x + r.width/2, r.y);
    Point p3 = new Point(r.x + r.width, r.y + r.height/2);
    Point p4 = new Point(r.x + r.width/2 + 1, r.y + r.height - 1);

    PointList pointList = new PointList();
    pointList.addPoint(p1);
    pointList.addPoint(p2);
    pointList.addPoint(p3);
    pointList.addPoint(p4);

    // Set the colors
    graphics.setForegroundColor(ColorConstants.black);
    graphics.setBackgroundColor(ColorConstants.white);

    // Fill the shape
    graphics.fillPolygon(pointList);
    
    // Draw the outline
    graphics.setLineWidth(LINE_WIDTH);
    graphics.drawLine(p1, p2);
    graphics.drawLine(p2, p3);
    graphics.drawLine(p3, p4);
    graphics.drawLine(p4, p1);
  }
}
