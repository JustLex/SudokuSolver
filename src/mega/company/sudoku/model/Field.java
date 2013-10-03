package mega.company.sudoku.model;

public class Field {
	protected Cell[][] field;
	protected int size;
	
	public Cell[][] getField() {
		return field;
	}
	
	public Field(int[][] _matrix) {
		size = 9;
		field = new Cell[size][size];
		
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				field[i][j] = new Cell(_matrix[i][j]);
	}
	
	public int[][] getIntMatrix() {
		int[][] temp = new int[size][size];
		
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				temp[i][j] = field[i][j].getValue();
		
		return temp;				
	}
}
