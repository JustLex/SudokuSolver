package mega.company.sudoku.ui;

import mega.company.sudoku.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SudokuSolver extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sudoku_solver);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sudoku_solver, menu);
		return true;
	}

}