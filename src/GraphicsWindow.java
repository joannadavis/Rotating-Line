import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class GraphicsWindow  extends Applet{
	Line line;
	int sleepTime;
	//Given a GameOfLife, a new GameOfLife is constructed
	public GraphicsWindow(Line l){
		line=l;
		sleepTime=10;
	}

	public void setSleepTime(int st){
		this.sleepTime= st;
	}
	
	//This is the method that allows the viewer to see the board and the generations
	//The method receives the number of generations. The original generation is called generation 0.
	//The timer is set to change to the next generation after 5 seconds
	public void run (boolean isRunning)
			throws InterruptedException{

		if(isRunning){
			final JFrame frame = new JFrame(); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 400);
			
			frame.setLayout(new BorderLayout());
			frame.add(new Button("Rotate"), BorderLayout.NORTH);
			frame.add(new Button("Reverse"), BorderLayout.SOUTH);
			
			RotatingLineComponent component = new RotatingLineComponent(line);
			frame.add(component);
			frame.setVisible(true);
			
			for (int gen=0; gen<10000; gen++){
				frame.setTitle("Line Rotation Angle " + line.getAngle());
				frame.repaint();

				frame.setVisible(true);
				Thread.sleep(sleepTime);
				line.increaseAngle();

			}
		}
	}
}