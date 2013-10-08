package mega.company.sudoku.views;

import android.content.Context;
import android.widget.TableLayout;

public class SudokuLayout extends TableLayout {
	private int size;
	
	public SudokuLayout(Context context, int size) {
		super(context);
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}
