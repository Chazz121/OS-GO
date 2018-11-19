import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Board {
	private BufferedImage blankBoard;

	public Board()  {
		JFrame frame = new JFrame("Go Game");
		JPanel jp = new JPanel();
		Dimension d = new Dimension(1280,720);
		jp.setSize(d);
		jp.setBackground(Color.RED);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		try {
			this.blankBoard = ImageIO.read(new File("src/BlankGoBoard.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel boardPic = new JLabel(new ImageIcon(blankBoard));
		boardPic.setSize(d);
		frame.getContentPane().add(boardPic, BorderLayout.CENTER);
		
		
		frame.setSize(d);

		
		frame.setVisible(true);
	}
	
}
