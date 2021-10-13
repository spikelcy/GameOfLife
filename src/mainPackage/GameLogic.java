package mainPackage;

public class GameLogic {
	
	public static final int BOARD_SIZE = 15;
	
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

}
