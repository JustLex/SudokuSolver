package mega.company.sudoku.views;

import java.util.Random;

import android.content.Context;
import android.widget.Button;
import android.widget.TableLayout.LayoutParams;

public class SudokuCell extends Button {
	public SudokuCell(Context context) {
		super(context);
		LayoutParams params = new LayoutParams();
		params.height = LayoutParams.MATCH_PARENT;
		params.width = LayoutParams.MATCH_PARENT;
		this.setLayoutParams(params);
		this.setBackgroundColor(new Random().nextInt());
	}
}
