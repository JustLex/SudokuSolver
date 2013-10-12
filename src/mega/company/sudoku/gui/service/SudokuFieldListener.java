package mega.company.sudoku.gui.service;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.logic.SudokuFieldProcessor;
import android.view.View;
import android.view.View.OnClickListener;

public class SudokuFieldListener implements OnClickListener{
	private SudokuFieldProcessor processor;
	
	public SudokuFieldListener(SudokuFieldProcessor processor) {
		super();
		this.processor = processor;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button_solve: 
			processor.solve();
			break;
		case R.id.button_clear:
			processor.cleanField();
		}
	}
}
