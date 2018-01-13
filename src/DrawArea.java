import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JComponent;

public class DrawArea extends JComponent {
	
	private Image image;	// image in which we are going to draw	
	private Graphics2D g2;	// Used to draw on
	
	// Mouse Coordinates
	private int currentX;
	private int currentY;
	private int oldX;
	private int oldY;

	public DrawArea() {
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				// save coords x,y when mouse is pressed
				oldX = e.getX();
				oldY = e.getY();
			}
			
		});
		
		addMouseMotionListener(new MouseMotionAdapter() {

			public void mouseDragged(MouseEvent e) {
				// coords x,y when drag mouse
				currentX = e.getX();
				currentY = e.getY();
				
				if(g2 != null) {
					// draw line if g2 is not null
					g2.drawLine(oldX, oldY, currentX, currentY);
					// refresh draw area
					repaint();
					// store current coords x,y as old x,y
					oldX = currentX;
					oldY = currentY;
				}
			}			
		});
	}
	
	protected void paintComponent(Graphics g) {
		if(image == null) {
			// if image to draw is null -> create image
			image = createImage(getSize().width, getSize().height);
			g2 = (Graphics2D) image.getGraphics();
			// enable antialiasing
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.setStroke(new BasicStroke(15,
                    BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND));		
			// clear draw area
			clear();
		}
		
		g.drawImage(image, 0, 0, null);
	}
	
	public void setBrushSize(int size) {
		g2.setStroke(new BasicStroke(size,
                BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND));
	}
	
	
	public void clear() {
		g2.setPaint(Color.WHITE);
		g2.fillRect(0, 0, getSize().width, getSize().height);
		g2.setPaint(Color.BLACK);
		repaint();
	}
	
	public void lightDarkBlue() {
		g2.setPaint(new Color(46, 49, 146));
	}
	
	public void darkDarkBlue() {
		g2.setPaint(new Color(27, 20, 100));
	}
	
	public void lightPurple() {
		g2.setPaint(new Color(146, 39, 143));
	}
	
	public void darkPurple() {
		g2.setPaint(new Color(99, 4, 96));
	}
	
	public void lightYellow() {
		g2.setPaint(new Color(255, 242, 0));
	}
	
	public void darkYellow() {
		g2.setPaint(new Color(171, 160, 0));
	}
	
	public void lightBrown() {
		g2.setPaint(new Color(166, 124, 82));
	}
	
	public void darkBrown() {
		g2.setPaint(new Color(96, 57, 19));
	}
	
	public void lightOrange() {
		g2.setPaint(new Color(242, 101, 34));
	}
	
	public void darkOrange() {
		g2.setPaint(new Color(160, 65, 13));
	}
	
	public void lightPink() {
		g2.setPaint(new Color(242, 109, 125));
	}
	
	public void darkPink() {
		g2.setPaint(new Color(158, 0, 57));
	}
	
	public void lightGreen() {
		g2.setPaint(new Color(0, 255, 0));
	}
	
	public void darkGreen() {
		g2.setPaint(new Color(25, 123, 48));
	}
	public void lightLightGreen() {
		g2.setPaint(new Color(196, 223, 155));
	}
	public void darkLightGreen() {
		g2.setPaint(new Color(172, 211, 115));
	}
	
	public void lightRed() {
		g2.setPaint(new Color(237, 28, 36));
	}
	
	public void darkRed() {
		g2.setPaint(new Color(158, 11, 15));
	}
	
	public void lightBlue() {
		g2.setPaint(new Color(0, 174, 239));
	}
	
	public void darkBlue() {
		g2.setPaint(new Color(0, 0, 255));
	}
	
	public void gray() {
		g2.setPaint(new Color(109, 109, 109));
	}
	
	public void black() {
		g2.setPaint(Color.BLACK);
	}
	
	public void eraser() {
		g2.setPaint(Color.WHITE);
	}
}
