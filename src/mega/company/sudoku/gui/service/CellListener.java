package mega.company.sudoku.gui.service;

import mega.company.sudoku.gui.logic.FieldHandler;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

public class CellListener implements OnFocusChangeListener{
	FieldHandler handler;

	public CellListener(FieldHandler handler) {
		super();
		this.handler = handler;
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		if (hasFocus){
			handler.setActive((EditText)v);
		}
	}
}
