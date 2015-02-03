import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class RotatingLineComponent extends JComponent{
	Line line;

	/**
	 * ctor for the GOLComponent object
	 * @param g
	 */
	public RotatingLineComponent(Line g){
		line=g;
	}

	/**
	 * Setter method for game of life object
	 * @param g
	 */
	public void setLineComponent(Line g){
		line = g;
	}

	/**
	 * This method paints the cells on the board
	 */
	public void paintComponent (Graphics g){
		Graphics g2 = (Graphics2D) g;
		((Graphics2D) g2).setColor(Color.magenta);

		JFrame frame = (JFrame) SwingUtilities.getRoot(this);

		int width=getVisibleRect().width;
		int height=getVisibleRect().height;

		int lineLength=(width+height)/2;
		double xComp=lineLength*Math.cos((Math.PI/180)*(line.getAngle()));
		double yComp=lineLength*Math.sin((Math.PI/180)*(line.getAngle()));
		int xStart=(int)Math.round( (width/2)+ xComp);
		int yStart=(int)Math.round( (height/2)+ yComp);
		int xEnd=(int)Math.round((width/2)-xComp);
		int yEnd=(int)Math.round((height/2)-yComp);
		((Graphics2D) g2).drawLine(xStart,yStart,xEnd,yEnd);

	}//end of paintComponent()
}