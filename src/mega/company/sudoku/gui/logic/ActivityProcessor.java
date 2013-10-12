package mega.company.sudoku.gui.logic;

import android.app.Activity;

public abstract class ActivityProcessor {
	private Activity activity;
	
	public Activity getActivity() {
		return activity;
	}

	public ActivityProcessor(Activity activity) {
		super();
		this.activity = activity;
	}
	
	public abstract void start();
}
