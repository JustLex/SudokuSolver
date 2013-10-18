package mega.company.sudoku.gui.service;

import mega.company.sudoku.gui.logic.SudokuFieldProcessor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KeyboardListener implements OnClickListener {
	SudokuFieldProcessor processor;
	
	public KeyboardListener(SudokuFieldProcessor processor) {
		super();
		this.processor = processor;
	}

	@Override
	public void onClick(View v) {
		Button btn = (Button) v;
		int num = Integer.parseInt((String) btn.getText());
		processor.setNumber(num);
	}

}
