import java.awt.Graphics;

import javax.swing.JPanel;

public class Game extends JPanel {

	public Game(){
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0,0, 20, 35);
		    
	}
	
}
