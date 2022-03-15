package chess;


import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
//	private int turn;
//	private Color currentPlayer;
//	private boolean check;
//	private boolean checkMate;
//	private ChessPiece enPassantVulnerable;
//	private ChessPiece promoted;
	
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		
		return mat;
	}
	
	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new King(board, Color.BLACK), new Position(4, 0));
		board.placePiece(new King(board, Color.BLACK), new Position(2, 0));
	}
	
//	
//	public boolean[][] possibleMoves(ChessPosition sourcePosition) {
//		
//	}
//	
//	public ChessPosition performChessMove(ChessPosition sourcePosition) {
//		
//	}
//	
//	public ChessPiece replacePromotedPiece(String type) {
//		
//	}
}
