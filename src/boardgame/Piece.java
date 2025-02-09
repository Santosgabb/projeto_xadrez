package boardgame;

public class Piece {
	//atributos 
	protected Position position; //permite que só essa classe tenha acesso ou as classes herdadas
	private Board board;
	
	public Piece(Board board) {
		this.board = null;
	}

	protected Board getBoard() {
		return board;
	}
}
