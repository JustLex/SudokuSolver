package mega.company.sudoku.gui.activities;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.logic.MainMenuProcessor;
import android.app.Activity;
import android.os.Bundle;

public class MainMenu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		
		MainMenuProcessor proc = new MainMenuProcessor(this);
		proc.start();
	}
}
