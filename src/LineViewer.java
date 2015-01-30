import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class LineViewer {
	private static int height;
	private static int width;
	
	public int getWidth(){
		return this.width;
	}

	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public static void main(String[] args) {
		
		JPanel pane = new JPanel(new GridBagLayout());
		
		

		JFrame frame =  new JFrame();
		frame.setSize(width, height);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Line Rotation");
		frame.setVisible(true);
		

	}


}
