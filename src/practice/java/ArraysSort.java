package practice.java;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {

		int[] marks = { 12, 34, 45, 1, 5, 200 };

		Arrays.sort(marks);
		System.out.println(Arrays.toString(marks));  //[1, 5, 12, 34, 45, 200]

	}

}
