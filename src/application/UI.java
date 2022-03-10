package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		
		for(int i=pieces.length; i > 0; i--) {
			System.out.print(i + " ");
			for(int j=pieces.length; j > 0; j--) {
				printPiece(pieces[i-1][j-1]);
			}
			System.out.println("");
		}
		
		System.out.print(" ");
		char letterRow = 'a';
		for(int i=pieces.length; i > 0; i--) {
			 System.out.print(" " +letterRow);
			 letterRow += 1;
		}
	}
	
	public static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
