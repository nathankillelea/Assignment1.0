package Pieces;

import BoardLogic.Square;

public class Queen extends Piece {
	
	/**
	 * The constructor for a Queen.
	 * 
	 * @param x_pos The Queen's x position
	 * @param y_pos The Queen's y position
	 * @param color The Queen's color
	 */
	public Queen(int x_pos, int y_pos, Color color) {
		super(x_pos, y_pos, color);
	}
	
	public boolean isValidMove(Square[][] board, int end_x_pos, int end_y_pos) {
		if(isUniversalInvalidMove(board, end_x_pos, end_y_pos))
			return false;
		else if(isMovingDownAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingUpAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingLeftAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingRightAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingDiagonallyUpAndRightAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingDiagonallyUpAndLeftAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingDiagonallyDownAndRightAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else if(isMovingDiagonallyDownAndLeftAndPathIsClear(board, end_x_pos, end_y_pos))
			return true;
		else
			return false;
	}
	
}
