package mega.company.sudoku.gui.logic;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.service.KeyboardListener;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TableLayout;

public class SudokuFieldProcessor extends ActivityProcessor {
	private FieldHandler field;
//	private SolutionHandler solution;
	
	public SudokuFieldProcessor(Activity activity) {
		super(activity);
//		solution = new SolutionHandler();
	}

	@Override
	public void start() {
		KeyboardListener keyboardListener = new KeyboardListener(this);
		applyKeyboardListeners(keyboardListener);
		
		TableLayout root = (TableLayout) getActivity().
				findViewById(R.id.layout_sudoku_field);
		field = new FieldHandler(root);
	}
	
	private void applyKeyboardListeners(KeyboardListener listener){
		LinearLayout parent = (LinearLayout) getActivity().
				findViewById(R.id.layout_keyboard);
		for (int i = 0; i < 9; i++){
			parent.getChildAt(i).setOnClickListener(listener);
		}
	}
	
	public void solve() {
		byte[][] mtx = new byte[9][9];
		field.collectData(mtx);
//		mtx = solution.solve(mtx);
		field.setData(mtx);
	}	
	
	public void cleanField(){
		field.clean();
	}
	
	public void setNumber(int num){
		if (field.getActive() != null){
			field.setNumber(num);
		}
	}
}
