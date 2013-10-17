package mega.company.sudoku.model;

public class memCell extends Cell {
	
	private boolean[] checkField;
	
	public memCell (byte _value) {
		super(_value);
		checkField = new boolean[9];
	}
	
	public memCell () {
		super((byte) 0);
		checkField = new boolean[9];
	}
	
	public void setCheck(byte index, boolean value) {
		this.checkField[index] = value;
}
	
	public boolean check(byte _x) {
		return (!checkField[_x]);
	}
	
}
