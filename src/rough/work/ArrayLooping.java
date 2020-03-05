package rough.work;

import java.util.Arrays;

public class ArrayLooping {

	public static void main(String[] args) {
		
		int[][] a = { { 1, 2, 3 }, { 5, 6 }, { 7, 8, 9 } };
		for (int[] f : a) {
			for (int j : f) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
//		1 2 3 
//		5 6 
//		7 8 9 
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {		
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
//		1 2 3 
//		5 6 
//		7 8 9 
			
	int []b= {6,66,666};
	System.out.println(Arrays.toString(b)); //[6, 66, 666]
		
		
		
		
		
		
		
		
	}
		


}
