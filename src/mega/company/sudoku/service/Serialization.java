package mega.company.sudoku.service;

import mega.company.sudoku.model.*;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serialization {
	public void serializeField(Field _f) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("field.out");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(_f);
			oos.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void serializeField(Field _f, String _filename) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(_filename);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(_f);
			oos.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Field deserializeField(String _filename) {
		Field temp = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(_filename);
			ois = new ObjectInputStream(fis);
			temp = (Field)ois.readObject();
			ois.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		return temp;
	}
}