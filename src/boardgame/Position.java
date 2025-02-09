package boardgame;

public class Position {
	//atributos
	private int row;
	private int colum;
	
	//contrutor
	public Position(int row, int colum) {
		this.row = row;
		this.colum = colum;
	}
	//gett e sett
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColum() {
		return colum;
	}

	public void setColum(int colum) {
		this.colum = colum;
	}
	//toString 
	@Override
	public String toString() {
		
		return row + ", " + colum;
		
	}
}
