package mega.company.sudoku.gui.logic;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.service.SudokuFieldListener;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

public class SudokuFieldProcessor extends ActivityProcessor {
//	private SolutionHandler solution;
	private TableLayout root;
	
	public SudokuFieldProcessor(Activity activity) {
		super(activity);
		root = (TableLayout) getActivity().
				findViewById(R.id.layout_sudoku_field);
//		solution = new SolutionHandler();
	}

	@Override
	public void start() {
		SudokuFieldListener listener = new SudokuFieldListener(this);
		setListeners(listener);
	}
	
	private void setListeners(SudokuFieldListener listener){
		applyListener(R.id.button_solve, listener);
		applyListener(R.id.button_clear, listener);
	}
	
	private void applyListener(int id, SudokuFieldListener listener){
		Button btn = (Button) this.getActivity().findViewById(id);
		btn.setOnClickListener(listener);
	}
	
	public void solve() {
		byte[][] mtx = new byte[9][9];
		collectData(mtx);
//		mtx = solution.solve(mtx);
		setData(mtx);
	}
	
	private byte[][] collectData(byte[][] mtx){
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
	
	private void setData(byte[][] mtx){
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				currentField.setText(Byte.toString(mtx[i][q]));
			}
		}
	}
	
	public void cleanField(){
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				currentField.setText("");
			}
		}
	}
}
