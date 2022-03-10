package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public class ChessPiece extends Piece{
	
	private Color color;
	private static int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
//	public ChessPosition getChessPosition() {
//		
//	}
//	
//	protected boolean isThereOpponentPiece(Position position) {
//		
//	}
//	
//	protected void increaseMoveCount() {
//		moveCount ++;
//	}
//	
//	protected void decreaseMoveCount() {
//		moveCount --;
//	}
//
}
