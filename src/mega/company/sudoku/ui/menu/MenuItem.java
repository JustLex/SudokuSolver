package mega.company.sudoku.ui.menu;

public class MenuItem {
	private String name;
	private MenuItem parent;

	public String getName() {
		return name;
	}

	public MenuItem getParent() {
		return parent;
	}

	public MenuItem(String name, MenuItem parent) {
		super();
		this.name = name;
		this.parent = parent;
	}
}
