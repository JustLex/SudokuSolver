package mega.company.sudoku.gui.service;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.logic.MainMenuProcessor;
import android.view.View;
import android.view.View.OnClickListener;

public class MainMenuListener implements OnClickListener{
	private MainMenuProcessor processor;
	
	public MainMenuListener(MainMenuProcessor processor) {
		super();
		this.processor = processor;
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button_new_field: 
			processor.newField();
			break;
		case R.id.button_exit:
			processor.exit();
		}
	}
}
