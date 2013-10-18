package mega.company.sudoku.logic;

import mega.company.sudoku.model.Field;
import mega.company.sudoku.model.memCell;

public class SolutionHandler {

	private memCell[][] m;
	private byte size, uk, un;
	private byte[] qx, qy;

	/*
	 * private boolean checkPossibility(byte _x, byte _y, byte _number) {
	 * 
	 * for (byte i = 0; i < size; i++) { if (f[i][_y] == _number) return false;
	 * if (f[_x][i] == _number) return false; }
	 * 
	 * for (byte i = (byte) ((_x / 1) * 3); i < ((_x / 1) * 3 + 3); i++) for
	 * (byte j = (byte) ((_y / 1) * 3); j < ((_y / 1) * 3 + 3); j++) { if
	 * (f[i][j] == _number) return false; } return true; }
	 */
	private void make(byte _x, byte _y) {

		for (byte i = 0; i < size; i++) {
			m[i][_y].setCheck((byte) (m[_x][_y].getValue() - 1), true);
			m[_x][i].setCheck((byte) (m[_x][_y].getValue() - 1), true);
		}

		for (byte i = (byte) ((_x / 1) * 3); i < ((_x / 1) * 3 + 3); i++)
			for (byte j = (byte) ((_y / 1) * 3); j < ((_y / 1) * 3 + 3); j++) {
				m[i][j].setCheck((byte) (m[_x][_y].getValue() - 1), true);

			}

	}

	private void push(byte _x, byte _y) {
		qx[uk] = _x;
		qy[uk] = _y;
		uk++;
	}

	private void pop() {
		un++;
	}

	public SolutionHandler(Field _field) {
		size = _field.getSize();
		memCell[][] m = new memCell[size][size];
		m = (memCell[][]) _field.getField();
		qx = new byte[size * size];
		qy = new byte[size * size];
		uk = 0;
		un = 0;
	}

	public boolean solve() {
		for (byte i = 0; i < size; i++)
			for (byte j = 0; j < size; j++) {
				if (m[i][j].getValue() != 0) {
					push(i, j);
					make(i, j);
				}

			}

		while (uk != un) {
			byte tmp = 0;
			for (byte i = 0; i < 9; i++) {
				if (m[qx[un]][qy[un]].check(i)) {
					tmp++;
				}
				if (tmp == 1) {
					for (byte j = 0; j < 9; j++) {
						
					}
				}
			}

		}

		return false;
	}

}
