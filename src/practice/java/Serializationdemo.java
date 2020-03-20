package practice.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializationdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Save obj = new Save();
		obj.i = 4;

		File f = new File("H:\\eclipseWin10\\Resurrection\\serializedemo.txt");
		FileOutputStream fos = new FileOutputStream(f);

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();

		// InterfaceImplementBankRules.java if Save class does not implement
		// Serializable

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Save s = (Save) ois.readObject();
		System.out.println("Reading with ObjectInputstream " + s.i);
		ois.close();

	}

}

class Save implements Serializable {

	int i;
}
