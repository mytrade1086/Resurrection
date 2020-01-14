package practice.java;

public class ArrayConcept {

	public static void main(String[] args) {

		int[] a = new int[3];

		// Empty array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); // 0 0 0(Default Value of Integer)
		}

		a[0] = 1;
		a[1] = 2;
		System.out.println("Array Length is" + a.length); // 3 is the length
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); // 1 2 0(Default Value of Integer)
		}

		// System.out.println("Non Existent access" + a[5]); // array Out Of Bound

		String[] s = new String[3];
		// Empty Array
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]); // null null null (Default Value of String)

		}

		double[] d = new double[3];
		// Empty Array
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]); // 0.0 0.0 0.0 (Default Value of double)

		}

		Object[] o = new Object[3];
		// Empty Array
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]); // null null null (Default Value of Object )

		}

		System.out.println("Printing character array");
		char[] c = new char[3];
		// Empty Array
		for (int i = 0; i < c.length; i++) {
			System.out.println(o[i]); // null null null (Default Value of char )

		}

	}
}
