package mega.company.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

public class SudokuField extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solution_field);
		Button solve = (Button) findViewById(R.id.button_solve);
		solve.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button_solve: 
		      solveField();break;
		}
	}
	
	private void solveField(){
		int[][] mtx = new int[9][9];
		TableLayout root = (TableLayout) findViewById(R.id.layout_sudoku_field);
		TableRow currentRow;
		for (int i = 0; i < 9; i++){
			currentRow = (TableRow) root.getChildAt(i);
			for (int q = 0; q < 9; q++){
				EditText currentField = (EditText) currentRow.getChildAt(q);
				if (currentField.getText().length() != 0){
					mtx[i][q] = Integer.parseInt(currentField.getText().toString());
				}
			}
		}
	}
}
