package mega.company.sudoku.gui.logic;

import mega.company.sudoku.R;
import mega.company.sudoku.gui.activities.SudokuField;
import mega.company.sudoku.gui.service.MainMenuListener;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

public class MainMenuProcessor extends ActivityProcessor{
	
	public MainMenuProcessor(Activity activity) {
		super(activity);
	}

	public void start(){
		MainMenuListener listener = new MainMenuListener(this);
		setListeners(listener);
	}
	
	public void newField(){
		Intent intent = new Intent(this.getActivity(), SudokuField.class);
	    this.getActivity().startActivity(intent);
	}
	
	public void exit(){
		System.exit(0);
	}
	
	private void setListeners(MainMenuListener listener){
		applyListener(R.id.button_new_field, listener);
		applyListener(R.id.button_exit, listener);
	}
	
	private void applyListener(int id, MainMenuListener listener){
		Button btn = (Button) this.getActivity().findViewById(id);
		btn.setOnClickListener(listener);
	}
}
