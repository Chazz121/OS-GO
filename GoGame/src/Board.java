import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Board {
	public Board() {
		JFrame frame = new JFrame("Go Game");
		JPanel jp = new JPanel();
		Dimension d = new Dimension(1280,720);
		jp.setSize(d);
		jp.setBackground(Color.white);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		JLabel lab = new JLabel("hi");
		frame.getContentPane().add(jp, BorderLayout.CENTER);

		
		frame.setSize(d);

		
		frame.setVisible(true);
	}
	
}
