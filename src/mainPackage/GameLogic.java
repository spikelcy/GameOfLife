package mainPackage;

/**
 * 
 * @author Spikelcy
 * Class that holds all the logic within the program for colour changing.
 * 
 * Current status: early workings of changing colour and checking neighbours.
 *
 */
public class GameLogic {
	
	public static final int BOARD_SIZE = 15;
	public static final int START_OF_GRID = 0;
	
	// TODO: change the method to just change the colour of 1 sqaure
	public static Square[][] changeColour(Square[][] board) {
		
		
		
		
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int column = 0; column < BOARD_SIZE; column++) {
				if (board[row][column].getColour() == 1) {
					board[row][column].printCords();
					board[row][column].repaint();
					
					
				}
			}
		}
		return board;
		
	}
	
	
	
	//TODO: Finish checking method
	public static int checkNeighbours(Square[][] board, Square sq) {
		
		int row = sq.getWidth();
		int col = sq.getHeight();
		
		
		int rowStart  = Math.max( row - 1, START_OF_GRID   );
		int rowFinish = Math.min( row + 1, BOARD_SIZE - 1 );
		int colStart  = Math.max( col - 1, START_OF_GRID   );
		int colFinish = Math.min( col + 1, BOARD_SIZE - 1 );

		for ( int curRow = rowStart; curRow <= rowFinish; curRow++ ) {
		    for ( int curCol = colStart; curCol <= colFinish; curCol++ ) {
		    	if (board[curRow][curCol].getColour() == 1) {
		    		
		    	}
		    }
		}
		
		return 0;
		
	}
	
	
	

}