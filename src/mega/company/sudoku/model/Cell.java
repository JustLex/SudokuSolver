package mega.company.sudoku.model;

import java.io.Serializable;

public class Cell implements Serializable {
	private byte value;
	
	public static final byte FREE = 0;

	public byte getValue() {
		return value;
	}
	
	public Cell(byte _value) {
		value = _value;
	}
	
	public boolean isFree() {
		return value == FREE;
	}
}
