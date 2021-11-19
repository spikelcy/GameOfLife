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
	

	
	//add looping method that goes thru each square and check neighbour of each square.
	public static void step(Square[][] board) {
		
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int column = 0; column < BOARD_SIZE; column++) {
			}
		}
		
	}
	
	
	//TODO: Finish checking method
	public static int checkNeighbours(Square[][] board, Square sq) {
		
		int row = sq.getWidth();
		int col = sq.getHeight();
		
    	int status = sq.getColour();
    	int liveN = 0;
		int deadN = 0;
		
		int rowStart  = Math.max( row - 1, START_OF_GRID   );
		int rowFinish = Math.min( row + 1, BOARD_SIZE - 1 );
		int colStart  = Math.max( col - 1, START_OF_GRID   );
		int colFinish = Math.min( col + 1, BOARD_SIZE - 1 );

		for ( int curRow = rowStart; curRow <= rowFinish; curRow++ ) {
		    for ( int curCol = colStart; curCol <= colFinish; curCol++ ) {
				
		    	//if current neighbour is black, count up liveN.
		    	// if current neighbour is white, count up deadN.
		    	if (board[curRow][curCol].getColour() == 1) {
		    		liveN ++;
		    	}else {
		    		deadN ++;
		    	}
		    }
		}
		
		// IF cell is dead, only return 1 if there are exactly 3 neighbours, else
		// return 1 only if exactly 2 or 3.
		if (status == 0) {
			
			if (liveN == 3) {
				return 1;
			}
		}else {
		
		if ( liveN == 2 || liveN == 3) {
			return 1;
		}
		
		}
		
		// If none of the requirements met, return 0 to show death.
		return 0;
		
	}
	
	
	

}
