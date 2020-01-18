package practice.java;

public class InstanceOf {
	
	//Seems like works wih Object tyoe only
	
	static int i=10;
	
	static String name="sumit";
	
	static Integer code=50;
	
	static char gender;
	
	
	boolean pass;
	
	
	public static void main(String[] args) {
		
		//System.out.println(i instanceof Integer); //CE
		
		System.out.println(name instanceof String);//true
		
		//System.out.println(gender instanceof char);//CE
		
		System.out.println(code instanceof Integer);//true
		
		
		
		
	}
			
			

}
