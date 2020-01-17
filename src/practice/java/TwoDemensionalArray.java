package practice.java;

public class TwoDemensionalArray {

	public static void main(String[] args) {

	//1 Way 1 of filling arrays
		int [][]arr=new int [2][3];
		
		arr[0][0]=00;
		arr[0][1]=01;
		arr[0][2]=02;
		
		arr[1][0]=10;
		arr[1][1]=11;
		arr[1][2]=12;
		
		System.out.println(arr.length);  //2
		System.out.println(arr[0].length);//3
		
		
		//2.  Way 2 of filling arrays{{firstrow},{secondrow}
		int [][]arr2= {{00,01,02},{10,11,12}};
		
		System.out.println(arr2.length);//2
		System.out.println(arr2[0].length);//3
		
				
		

	}
}
