package mega.company.sudoku.ui.menu;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> options;

	public ArrayList<MenuItem> getOptions() {
		return options;
	}

	public void addOption(MenuItem option){
		options.add(option);
	}
}
