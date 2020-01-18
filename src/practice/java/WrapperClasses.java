package practice.java;

public class WrapperClasses {

	//Primitive into Object and Vice Versa conversion
	/*
	 * #PRIMITIVITE==>OBJECT ==Autoboxing
	 * 
	 * 1.boolean ==>Boolean 2.byte==>Byte 3.short==>Short char ==>Character
	 * 4.int==>Integer 5.long==>Long 6.float==>Float 7 double==>Double
	 */
			
	public static void main(String[] args) {
		
		
		int i=10;
		
		
		Integer j=Integer.valueOf(i);
		
		System.out.println(j);
		System.out.println(j.getClass().getName()); //java.lang.Integer
		
		System.out.println(j instanceof Integer);//true
		//
		Integer ab=i; //AutoBoxing
		System.out.println(ab.getClass().getName()); //java.lang.Integer
		
		
		

	}

}
