package mainPackage;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

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
		

		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

		//initialize board
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int column = 0; column < BOARD_SIZE; column++) {
				Square sq = new Square(row, column);
				board[row][column] = sq;
				//tempBoard[row][column] = new Square(row, column);
				
				//add mouse click lister to switch colour if clicked
				board[row][column].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						//sets it to change colour too.
						sq.printCords();
						sq.repaint();
						
						System.out.println(sq.getColour());
						
						main.validate();
						main.repaint();

						
					}
				});
				
				
				
				//add to panel
				grid.add(sq);
			}
		}
		
		JLabel lblNewLabel = new JLabel("Game of Life");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		listPane.add(lblNewLabel);
		
		JPanel buttonGrid = new JPanel();
		buttonGrid.setSize(20, 20);
		buttonGrid.setLayout(new BoxLayout(buttonGrid, BoxLayout.X_AXIS));
		//buttonGrid.setLayout(new GridLayout(1, 2));
		
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		buttonGrid.add(btnNewButton);
		
		
		//Change black squares to white(test)
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int row = 0; row < BOARD_SIZE; row++) {
					for (int column = 0; column < BOARD_SIZE; column++) {
						
						// check if the current square needs to be colour changed 
						// 1 is alive, 0 is death
						GameLogic.checkNeighbours(board, board[row][column]);
						
						

						
				
						
					}
				}
					
					for (int row1 = 0; row1 < BOARD_SIZE; row1++) {
						for (int column1 = 0; column1 < BOARD_SIZE; column1++) {
						
							// if square should be alive but is dead, repaint
							if(board[row1][column1].getLive() == 1 && board[row1][column1].getColour() == 0 ) {
								
								board[row1][column1].printCords();
								board[row1][column1].repaint();
							}
							
							// if square should be dead but is alive, repaint.
							if(board[row1][column1].getLive() == 0 && board[row1][column1].getColour() == 1 ) {
								board[row1][column1].printCords();
								board[row1][column1].repaint();
							}
							
						
						
						}
						
				
					}
				
			
				
				
				//board = GameLogic.changeColour(board);
				main.validate();
				main.repaint();
				
				
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("Stop");
		buttonGrid.add(btnNewButton_1);
		listPane.add(buttonGrid);
		listPane.add(Box.createRigidArea(new Dimension(0,5)));
		listPane.add(grid);
		
	    btnNewButton_1.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	                    
	        }  
	        });  
		
		
		this.add(listPane);
	
		
	}

}
