package mega.company.sudoku.views;

import android.content.Context;
import android.widget.TableLayout;
import android.widget.TableRow;

public class SudokuLayout extends TableLayout {
	
	public SudokuLayout(Context context, int count) {
		super(context);
		LayoutParams params = new LayoutParams();
		params.height = LayoutParams.MATCH_PARENT;
		params.width = LayoutParams.MATCH_PARENT;
		this.setLayoutParams(params);
		applyElements(count);
	}
	
	public SudokuLayout(Context context){
		super(context);
	}
	
	private void applyElements(int count){
		for (int i = 0; i < count; i++){
			TableRow newRow = new TableRow(this.getContext());
			for(int q = 0; q < count; q++){
				SudokuCell text = new SudokuCell(this.getContext());
				newRow.addView(text);
			}
			this.addView(newRow);
		}
	}
}
