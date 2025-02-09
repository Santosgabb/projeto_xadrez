package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		//Intanciando o Objetgo criado Board(Tabuleiro)
	ChessMatch	chessMatch = new ChessMatch();
	//
	UI.printBoard(chessMatch.getPieces());
	}

}
