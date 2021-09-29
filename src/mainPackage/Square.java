package mainPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


/**
 * 
 * @author Spikelcy
 * Square Class that contains info related to each sqaure on the grid.
 * 
 * Current status: early proof of concept.
 *
 */


public class Square extends JComponent {
	private char content;
	private int row;
	private int col;
	private final int SIZE = Options.SQUARE_SIZE;
	
	/**
	 * Constructor 1
	 * @param row - initial row
	 * @param col - initial column
	 * sets null char to be (char) -1
	 * 
	 */
	public Square(int row, int col) {
		this.row = row;
		this.col = col;
	}
	/**
	 * Paints the outline if the middle square as proof of change.
	 */
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (row==7 && col==7) {
			g.setColor(Color.red);
			g.drawRect(0, 0, SIZE+1, SIZE-2);
		} else {
			g.setColor(Color.black);
			g.drawRect(0, 0, SIZE+1, SIZE-2);
		}

	}
	
}
