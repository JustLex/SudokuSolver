package mega.company.sudoku.gui.activities;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.logic.SudokuFieldProcessor;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SudokuField extends Activity{
	SudokuFieldProcessor processor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solution_field);
		
		processor = new SudokuFieldProcessor(this);
		processor.start();
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.field_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.button_solve: processor.solve(); break;
			case R.id.button_clear: processor.cleanField(); break;
		}
		return super.onOptionsItemSelected(item);
	}
}
