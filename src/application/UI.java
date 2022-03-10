package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		
		
		for(int i=pieces.length; i > 0; i--) {
			System.out.print(i + " ");
			for(int j=0; j < pieces.length; j++) {
				printPiece(pieces[i-1][j]);
			}
			System.out.println("");
		}
		
		System.out.print(" ");
		char letterColumn = 'a';
		for(int i=pieces.length; i > 0; i--) {
			 System.out.print(" " +letterColumn);
			 letterColumn += 1;
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
