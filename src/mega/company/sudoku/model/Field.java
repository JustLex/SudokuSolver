package mega.company.sudoku.model;

import java.io.Serializable;

public class Field implements Serializable {
	private Cell[][] field;
	private static final byte size = 9;
	
	public Cell[][] getField() {
		return field;
	}
	
	public byte getSize() {
		return size;
	}
	
	public Field(byte[][] _matrix) {
		field = new Cell[size][size];
		
		for (byte i = 0; i < size; i++)
			for (byte j = 0; j < size; j++)
				field[i][j] = new Cell(_matrix[i][j]);
	}
	
	public Field(Cell[][] _matrix) {
		field = new Cell[size][size];
		
		for (byte i = 0; i < size; i++)
			for (byte j = 0; j < size; j++)
				field[i][j] = _matrix[i][j];
	}
			
	public byte[][] getByteMatrix() {
		byte[][] temp = new byte[size][size];
		
		for (byte i = 0; i < size; i++)
			for (byte j = 0; j < size; j++)
				temp[i][j] = field[i][j].getValue();
		
		return temp;				
	}
}
