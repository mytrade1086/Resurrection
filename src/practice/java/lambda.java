package practice.java;

import java.util.ArrayList;

public class lambda {

	public static void main(String[] args) {
	

		ArrayList <Integer> al=new ArrayList<Integer>();
		
		al.add(12);
		al.add(1);
		al.add(156);
	
		al.forEach(x ->System.out.println(x));
//		12
//		1
//		156
//		
		
		
		
	}

}
