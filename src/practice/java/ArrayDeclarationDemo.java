package practice.java;

public class ArrayDeclarationDemo {

	public static void main(String[] args) {

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		for (int ele : a) {
			System.out.println(ele);
			/*
			 * 0 1 2
			 */
		}
		
		
		
		//#2
		
		int[]b= {11,22,33};
		
		for (int ele : b) {
			System.out.println(ele);
			/*
			    11
				22
				33
			 */
		}
		
		
		
		//#3
		int[]c=new int[] {111,222,333};
		
		for (int ele : c) {
			System.out.println(ele);
			/*
			   111
			   222
			   333
			 */
		}
		
		
				
		}
	}

