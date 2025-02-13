package boardgame;

public abstract class Piece {
	//atributos 
	protected Position position; //permite que só essa classe tenha acesso ou as classes herdadas
	private Board board;
	
	public Piece(Board board) {
		this.board = null;
	}

	protected Board getBoard() {
		return board;
	}
	public abstract boolean [] [] possibleMoves();
	public boolean possibleMove (Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	//movimentos possiveis das peça
	public boolean isThereAnyPossibleMove() {
		boolean [] [] mat = possibleMoves();
		for (int i = 0; i<mat.length; i++) {
			for (int j =0; j<mat.length; j++) {
				if (mat[i] [j]) {
				return true;	
				}
			}
		}
		return false;
	}
	
}