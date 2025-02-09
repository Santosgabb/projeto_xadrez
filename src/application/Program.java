package application;

import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		
		//Intanciando o Objetgo criado Board(Tabuleiro)
		Board board = new Board(8, 9);
		System.out.println(board);
	}

}
