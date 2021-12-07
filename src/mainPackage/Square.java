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
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	private int col;
	private int colour = 0; // Black = 1, White = 0
	public int getColour() {
		return colour;
	}

	public void setColour(int num) {
		this.colour = num;
	}
	
	private int live = 0; // live status
	public int getLive() {
		return live;
	}

	public void setLive(int live) {
		this.live = live;
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
		//System.out.println("Row:"+row+"Col:"+col);
		
		//changes statis of sqaure to black if its white
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
			
		} else {
			g.setColor(Color.black);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
		}

	}
	
	
	
	/**
	 * Changes colour of square.
	 * set it to its colour for now. so white = 0 and 1 = black
	 */
	
	/**public void changeColour(Graphics g) {
		if (colour == 0) {
			g.setColor(Color.white);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
		} else {
			g.setColor(Color.black);
			g.fillRect(0, 0, SIZE+1, SIZE-2);
		}

	}
	
	**/
	
	
}
