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

		for (byte i = (byte) ((_x / 3) * 3); i < ((_x / 3) * 3 + 3); i++)
			for (byte j = (byte) ((_y / 3) * 3); j < ((_y / 3) * 3 + 3); j++) {
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

	public SolutionHandler() {
		size = 9;
		qx = new byte[size * size];
		qy = new byte[size * size];
		uk = 0;
		un = 0;
		
		m = new memCell[size][size];
	}

	public byte[][] solve(byte[][] _field) {
		
	

		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				m[i][j] = new memCell(_field[i][j]);
			}
		
		
		for (byte i = 0; i < size; i++)
			for (byte j = 0; j < size; j++) {
				if (m[i][j] != null && m[i][j].getValue() != 0) {
					for (byte l = 0; l < size; l++)
						m[i][j].setCheck(l, true);
					push(i, j);
					make(i, j);
				}

			}

		for (byte l = 0; l < size*size; l++)
			for (byte i = 0; i < size; i++)
				for (byte j = 0; j < size; j++) {
					if (m[i][j].getValue() != 0) continue;
					byte tmp = 0;
					for (byte p = 0; p < size; p++)
						if (m[i][j].check(p))
							tmp++;
					if (tmp == 1) {
						for (byte p = 0; p < size; p++) {
							if (m[i][j].check(p)) {
								tmp = (byte) (p+1);
								break;
							}
						}
						m[i][j].setValue((byte) (tmp));
						make(i, j);
					}
					
				}
		
		byte[][] res = new byte[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				res[i][j] = (m[i][j].getValue());
			}
		return res;
	}
}
