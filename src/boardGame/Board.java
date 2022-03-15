package boardGame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 0 || columns <0)
			throw new BoardException("Erro criando tabuleiro, é necessário que o numero de linhas e colunas seja maior que zero");
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if(!positionExists(row,column)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		
		if(thereIsAPiece(position))
			throw new BoardException("Já existe uma peça nessa possição");
		if(!positionExists(position))
			throw new BoardException("Posição fora do tabuleiro");
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
//	
//	public Piece removePiece(Position position) {
//		
//	}
//	
	
	public boolean positionExists(int row, int column) {
		return (row < rows &&
				column < columns &&
				row >= 0 &&
				column >= 0);
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position))
			throw new BoardException("Posição fora do tabuleiro");
		int i = position.getRow();
		int j = position.getColumn();
		
		if(pieces[i][j] != null)
			return true;
		else
			return false;
	}
}
