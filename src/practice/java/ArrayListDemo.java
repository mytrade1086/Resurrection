package practice.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		// Will Create list with Default 10 virtual capacity

		System.out.println(a.size()); // 0 size it based on physical items hence 0 as no item added yet

		a.add("sumit");
		a.add("sagar");
		a.add("sumit");
		System.out.println(a.size()); // 3

		for (int i = 0; i < a.size(); i++) {

			System.out.println(a.get(i)); // prints everything

		}

		a.remove(0);
		System.out.println(a.size()); // now size is 2
		System.out.println(a.get(100));

		ArrayList<Integer> aij = new ArrayList<Integer>();
		aij.add(10);
		aij.add(20);
		aij.add(30);

	}
}
