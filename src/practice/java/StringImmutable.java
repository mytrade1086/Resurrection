package practice.java;

public class StringImmutable {
	
	public static void main(String[] args) {
		
		/*
		 * Once we create String object we can't perform any changes in existing Object.
		 * If we try to change it new object is created with those changes. This
		 * Behavior is called Immutability.
		 */
		
		
		String s=new String("Sumit");
		
		System.out.println(s.concat("Raut")); //SumitRaut
		
		System.out.println(s);//Sumit
		
		
		String s2=new String("Sumit");
		System.out.println(s==s2); //false        object comparison
		System.out.println(s.equals(s2));// true  content comparison
		
		
		
		String s3="same";
		String s4="same";
		
		System.out.println(s3==s4); //  true      object comparison
		System.out.println(s3.equals(s4));// true  content comparison
		
		
		
		
	}

}
