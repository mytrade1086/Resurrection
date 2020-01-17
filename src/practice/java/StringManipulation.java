package practice.java;

public class StringManipulation {

	static String name = "This is Sparta";
	static String dummy = "dummy text";

	static String str = "one;two;three;four";

	public static void main(String[] args) {

		System.out.println(name.length()); // 14

		System.out.println(name.charAt(0)); // T

		// System.out.println(name.charAt(1000));
		//non existing index will give java.lang.StringIndexOutOfBoundsException

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

		System.out.println(name.substring(-1)); //java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	}

}
