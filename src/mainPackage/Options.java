package mainPackage;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.BoxLayout;

/**
 * 
 * @author Spikelcy
 * UI that will show the finite grid,allow for selection and start/stop of simulation
 * 
 * Current status: early proof of concept of grid and button layout.
 *
 */

public class Options extends JPanel {
	
	public static final int BOARD_SIZE = 15;
	public static final int SQUARE_SIZE = 35;
	private Square[][] board = new Square[BOARD_SIZE][BOARD_SIZE];

	/**
	 * Create the main panel with buttons and grid.
	 * Note: remember to change names.
	 * 
	 */
	public Options(Main main) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		
		JPanel listPane = new JPanel();
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
		JLabel lblNewLabel = new JLabel("Testing");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		

		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

		//initialize board
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int column = 0; column < BOARD_SIZE; column++) {
				Square sq = new Square(row, column);
				board[row][column] = sq;
				//tempBoard[row][column] = new Square(row, column);
				
				//add to panel
				grid.add(sq);
			}
		}
		
		
		listPane.add(lblNewLabel);
		listPane.add(Box.createRigidArea(new Dimension(0,5)));
		listPane.add(grid);
		
		
		this.add(listPane);
	
		
	}

}
