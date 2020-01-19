package practice.java;

public class ArrayObject {

	public static void main(String[] args) {
	// Any data can be entered in Object Array
		Object[][] data = new Object[2][2];
		data[0][0] = "sumit";
		data[0][1] = 10;
		data[1][0] = 12.00;
		data[1][1] = 'c';

		for (Object[] row : data) {

			for (Object value : row) {

				System.out.print(value + " ");
			}

			System.out.println("");
		}

//		sumit 10 
//		12.0 c 

	}

}
