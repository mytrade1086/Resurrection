package practice.java;

import java.util.Arrays;

public class StringManipulation {

	static String name = "This is Sparta";
	static String dummy = "dummy text";

	static String str = "one;two;three;four";

	static String strEmpty = "";
	static String nd = "Neha Deshmukh";

	public static void main(String[] args) {
		char[] fullname = nd.toCharArray();

		System.out.println(Arrays.toString(fullname)); // [N, e, h, a, , D, e, s, h, m, u, k, h]

		System.out.println(nd.substring(1)); // eha Deshmukh All including the index specified
		System.out.println(nd.substring(1, 4)); // eha Include beginning index- Excludes ending index(space in this
												// case)

		System.out.println(strEmpty.isEmpty()); // True since string is empty
		System.out.println(nd.isEmpty()); // False as non empty

		System.out.println(nd.startsWith("Neha")); // True
		System.out.println(nd.startsWith("Deshmukh")); // False
		System.out.println(nd.endsWith("Deshmukh")); // True
		System.out.println(nd.endsWith("ukh")); // True as ends with ukh
		System.out.println(nd.endsWith("shmu")); // False as middle word is not end
		System.out.println(nd.endsWith("Des")); // False as its not coming in end

		System.out.println(name.length()); // 14

		System.out.println(name.charAt(0)); // T

		// System.out.println(name.charAt(1000));
		// non existing index will give java.lang.StringIndexOutOfBoundsException

		System.out.println(name.contains("spa")); // False as case sensitive

		System.out.println(name.contains("Spa")); // True as case sensitive

		System.out.println(name.indexOf("T")); // 0

		System.out.println(name.indexOf("z")); // -1 for non existent char

		System.out.println(name.indexOf("s")); // 3 first occurrence of s

		System.out.println(name.indexOf("s", name.indexOf("s") + 1)); // 6

		System.out.println(dummy.replaceFirst("m", "x")); // duxmy text

		System.out.println(dummy.replaceAll("m", "x")); // duxxy text

		String[] arrstr = str.split(";");

		for (String x : arrstr) {

			System.out.println(x);
		}

		System.err.println("hi");
		System.out.println(name.substring(-1)); // java.lang.StringIndexOutOfBoundsException: String index out of range:

	}

}
