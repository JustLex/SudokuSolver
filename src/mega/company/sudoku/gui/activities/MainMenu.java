package mega.company.sudoku.gui.activities;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.logic.MainMenuProcessor;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainMenu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		
		MainMenuProcessor proc = new MainMenuProcessor(this);
		proc.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
}
