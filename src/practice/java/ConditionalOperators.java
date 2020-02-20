package practice.java;

public class ConditionalOperators {

	public static void main(String[] args) {
		//#1 Ternary Operator
		
		int a=12; int b=30;
		String output=((a>b)?"YES":"NO");
		System.out.println(output);  //NO
		
		//2.1 Logical && and ||	
		int c=9;
			if((a>b)&&(a>c)) {
			System.out.println("a is greatest");	
		}
		else if((b>a)&&(b>c)) {	
			System.out.println("b is greatest");	
		}
			
		//2.1
			
			
	}
}
