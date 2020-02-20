package practice.java;

//Child Class in Child UBS
//We have created three variables in parent
//Two of them have been repeated in child with same name

public class UBSParent {
	
	
	String parentname;   // Lets create same variable in parent
	int parentid;       //Lets create same variable in parent
	String parentExtra; //This is unique variable from Parent
	static String parentStatic;
	
	
	public void parentOne() {
		
		System.out.println("PUBLIC method from parent");
	}
	
	protected void parentProtected() {
		
		System.out.println("PROTECTED method from parent");
	}
	
	public static void parentStaticMethod() {
		
		System.out.println("STATIC METHOD from parent");
		
	}
	
	

}
