package mega.company.sudoku.gui.logic;

import mega.company.sudoku.gui.service.CellListener;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

public class FieldHandler {
	private TableLayout root;
	private EditText active;

	public FieldHandler(TableLayout root) {
		super();
		this.root = root;
		removeKeyListeners();
	}
	
	public EditText getActive() {
		return active;
	}
	
	public byte[][] collectData(byte[][] mtx){
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				if (currentField.getText().length() != 0){
					mtx[i][q] = Byte.parseByte(currentField.getText().toString());
				}
			}
		}
		return mtx;
	}
	
	public void setData(byte[][] mtx){
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				currentField.setText(Byte.toString(mtx[i][q]));
			}
		}
	}
	
	public void clean(){
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				currentField.setText("");
			}
		}
	}
	
	public void setActive(EditText v){
		active = v;
	}
	
	public void setNumber(int num){
		active.setText(num + "");
	}
	
	private void removeKeyListeners(){
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				currentField.setKeyListener(null);
				currentField.setOnFocusChangeListener(new CellListener(this));
			}
		}
	}
}
