package mega.company.sudoku.model;

public class memCell extends Cell {
	
	private boolean[] checkField;
	
	public memCell (byte _value) {
		super(_value);
		checkField = new boolean[9];
	}
	
	public boolean check(byte _x) {
		return (!checkField[_x]);
	}
	
}
