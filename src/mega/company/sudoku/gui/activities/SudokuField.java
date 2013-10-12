package mega.company.sudoku.gui.activities;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.logic.SudokuFieldProcessor;
import android.app.Activity;
import android.os.Bundle;

public class SudokuField extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solution_field);
		
		SudokuFieldProcessor proc = new SudokuFieldProcessor(this);
		proc.start();
	}
}
