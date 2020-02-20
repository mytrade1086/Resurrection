package practice.java;

//TakeAways:
//#1 Static field can be accessed/used in static /non static methods
//#2 If parent and child have same names for variables then preference in given to local class
//
//
//


public class UBSChild extends  UBSParent {
	String parentname;  // same variable present in Parent
	int parentid; // same variable present in Child
	String childExtra;
	static String staticChild;
	
	
	
	public void accessCheck() {
		parentname="sumit";
		parentid=111;	
		parentExtra="fromParent";  //Note that  non static method can access non static variable of parent
		parentStatic="neha";      //Note that  static field access by non static child method
		staticChild="childstattic";  // basically static can be accessed in static and non static method
	}

	public void childOne() {	
		System.out.println("PUBLIC method from child");
	}
	
	protected void Childprotected() {	
		System.out.println("PROTECTED method from child");
	}
	
	
	
public static void statictest() {
		
		System.out.println("STATIC METHOD from parent");
		
	}
	
	public static void main(String[] args) {
		UBSChild c=new UBSChild();
		c.parentOne();  //inherited method from child
		
		
		c.parentname="variblePointedinChild"; //Child varibale
		c.parentid=100;//Child variable
		c.parentExtra="somename";   // coming from Parent class 
		 parentStatic="sumit"; // Warning about static access
		
		
		statictest();
		parentStaticMethod();
		
		
		UBSParent p=new UBSParent();
		
		p.parentExtra="from parent";
		p.parentid=122;
		parentStatic="jj";   
		UBSParent.parentStaticMethod();
		
		
		
}
	
	
	
	
	

}
