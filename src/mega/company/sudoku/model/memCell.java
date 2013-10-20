package mega.company.sudoku.model;

public class memCell extends Cell {
	
	private boolean[] checkField = new boolean[9];
	
	public memCell (byte _value) {
		super(_value);
		checkField = new boolean[9];
	}
	
	public memCell () {
		super((byte) 0);
		checkField = new boolean[9];
	}
	
	public void setValue(byte _value) {
            this.value = _value;
    }
	
	public void setCheck(byte _index, boolean _value) {
		this.checkField[_index] = _value;
}
	
	public boolean check(byte _x) {
		return (!checkField[_x]);
	}
	
}
