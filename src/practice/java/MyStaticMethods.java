package practice.java;

public class MyStaticMethods {
	
	public static String college="KITS";
	public int default_age=16;
	
	public static void main(String[] args) {
		 one();   //direct call to static method allowed
		//two();   static method can't access not static method directly
		 
		 college="KITS Ramtek";  //static variable access possible
		 
		// default_age=17;    //static method cant access non static varibles
		
		
	}
	
	
	
	public static void  one() {
		System.out.println("this is static");
		 
		
	}
	
	public  void  two() {
		System.out.println("this is non static");
		 college="KITS Ramtek";
		 default_age=17;   // note that non static varible access possible
	}

}
