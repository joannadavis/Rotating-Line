import javax.swing.JFrame;

public class GraphicsWindow  {
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
			frame.setSize(400, 400);

//			frame.setLayout(new FlowLayout());
//		    JButton b1 = new JButton();   
//		    b1.setPreferredSize(new Dimension(200, 40));
//		    b1.setVisible(true);
//		    b1.setText("Stop");
//			frame.add(b1);


			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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