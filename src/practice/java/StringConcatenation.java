package practice.java;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		String one="sumit";
		
		System.out.println(num1+num2+one); //30sumit
		
		String two="10";
		System.out.println(num1+num2+one+two);//30sumit10 
		
		
		String three=null;
		System.out.println(num1+num2+one+two+three); //30sumit10null
		
		
		String add=num1+num2+one+two;
		System.out.println(add); //30sumit10
		
		System.out.println(add.concat(null)); //java.lang.NullPointerException  Concat will null gives NullPointerException
		
		
		
		
				

	}

}
