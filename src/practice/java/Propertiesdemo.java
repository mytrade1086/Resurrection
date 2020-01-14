package practice.java;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesdemo {

	public static void main(String[] args) throws IOException {

		/*Take Away
		 
		 *  1.getProperty will give value of property 
		    2.setProperty will create new key or update the existing one. 
		    3.If we are writing new property we will need FileOutputStream object so as to reflect in file
		
		 * 
		 */
		
		System.out.println(System.getProperty("user.dir"));

		Properties pr = new Properties();
		FileInputStream fi = new FileInputStream("H:\\eclipseWin10\\Resurrection\\DemoFile");
		pr.load(fi);
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));

		System.out.println(pr.getProperty("passord")); // non existing key will give null
		System.out.println(pr.getProperty("u")); // //non existing key will give null

		pr.setProperty("blank", "value set by setProperty"); // value set by setProperty
		System.out.println(pr.getProperty("blank"));

		System.out.println(pr.size()); // 3

		pr.setProperty("vg", "value set by setProperty"); // Adds new property or updates existing one
		fi.close();

		FileOutputStream fo = new FileOutputStream("H:\\eclipseWin10\\Resurrection\\DemoFile");
		pr.store(fo, "saved with outputstream");
		fo.flush();

	}

}
