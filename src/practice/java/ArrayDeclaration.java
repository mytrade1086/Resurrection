package practice.java;

public class ArrayDeclaration {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 5, 6, 7 } };  //array with two rows

		System.out.println(arr.length); //2 
		System.out.println(arr[0].length);//3

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
//		1 2 3 
//		5 6 7 
		
		

		int[][] arr2 = new int[2][3];
		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = Integer.parseInt(i + "" + j);
			}
		}

		int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.err.println("---Separator before two dimension 2d array");
		for (int[] ele : arr3) {
			for (int j : ele) {
				
			System.out.print(j + " ");
		}
		System.out.println("");
		
//		---Separator before two dimension 2d array
//		1 2 3 
//		4 5 6 
//		7 8 9 
		
		
		

	}
	}
}
