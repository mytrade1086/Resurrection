package practice.java;

public class IntegerParseintvsIntegerValueof {

	public static void main(String[] args) {
		
		//#1 Integer.parseInt() takes only String arguments
		
		//#2 Integer.valueOf() takes  String/char/int arguments

		int i = 10;
		String num = "10";
		char c = '5';
		
		System.out.println(Integer.parseInt(num)); //can only take string
		
		
		System.out.println(Integer.valueOf(i));  //can only take string  
		System.out.println(Integer.valueOf(c));  //can only take string
		System.out.println(Integer.valueOf(num));//can only take string
		
		
		
	}

}
