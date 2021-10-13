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
	private int colour = 0; // Black = 1, White = 0
	public int getColour() {
		return colour;
	}



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
	
	public void printCords() {
		System.out.println("Row:"+row+"Col:"+col);
		if (colour == 0){
			colour = 1;
		}else {
			colour = 0;
		}
		
	}
	
	
	/**
	 * Paints the outline if the middle square as proof of change.
	 */
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (colour == 0) {
			g.setColor(Color.white);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
			//this.colour = 1;
			
		} else {
			g.setColor(Color.black);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
			//this.colour = 0;
		}

	}
	
	
	
	/**
	 * Changes colour of square.
	 * If red, change to black and if black, change to red.
	 */
	
	public void changeColour(Graphics g) {
		if (colour == 0) {
			g.setColor(Color.white);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
		} else {
			g.setColor(Color.black);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
		}

	}
	
	
}
