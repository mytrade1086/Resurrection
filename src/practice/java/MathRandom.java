package practice.java;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		
		//Generating Random Number Math.Random()
		// it appears number are generated in double in range 0 to 1
		//we are downcasting to int after multiplying by 100
		for(int i=1;i<5;i++) {
		System.out.println( (int)(Math.random()*100));
		}

		
		
		//Method 2
		
		Random rc=new Random();
		for(int i=0;i<5;i++)
		 System.out.println(rc.nextInt(100));
		
		
		
	}
	
	

}
