import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class MyPanel extends JPanel {
	
	int[] x = {120, 160, 200, 200, 160, 120, 120};
	int[] y = {60, 20, 60, 100, 140, 100, 60};
	
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		  Graphics2D g2d = (Graphics2D) g;
	      g2d.setColor(Color.blue);
	      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	      g2d.setStroke(new BasicStroke(3));
	      g2d.drawRect(10, 10, 100, 50);
	      g2d.drawOval(10, 100, 80, 80);
	      g2d.drawPolyline(x, y, 7);
	}
}
