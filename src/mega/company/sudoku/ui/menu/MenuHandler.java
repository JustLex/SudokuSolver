package mega.company.sudoku.ui.menu;

public class MenuHandler {
	private MenuItem root;
	private MenuItem current;
	
	public MenuHandler(MenuItem root) {
		super();
		this.root = root;
		this.current = root;
	}

	public MenuItem getRoot() {
		return root;
	}

	public MenuItem getCurrent() {
		return current;
	}
}
