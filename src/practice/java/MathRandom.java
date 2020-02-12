package practice.java;

public class MathRandom {

	public static void main(String[] args) {
		
		//Generating Random Number
		// it appears number are generated in double in range 0 to 1
		//we are downcasting to int after multiplying by 100
		for(int i=1;i<100;i++) {
		System.out.println( (int)(Math.random()*100));
		}

	}

}
