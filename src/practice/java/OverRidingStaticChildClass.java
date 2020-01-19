package practice.java;

public class OverRidingStaticChildClass extends OverRidingStaticParentClass{
	
//static method of parent when overridden in child class as static its called method hiding.
//Method resolution based on REFERENCE only
	
//Ex.   Parent p=new Parent()  p.overridentmetho() ==>calls parent method
//Ex.   Child c=new child()  c.overridingMethod() ==>calls child method
//Ex.   Parent pc=new Child()  pc.<overridden/overriding method>() ==>calls parent method as PARENNT reference
	
	
//@OverRide Will give CE error as Parent method is static	
@OverRide
public static void methodparent() {		
		System.out.println("Static Method From Child Class");
	}


//#2 If Overriding method in child throws CHECKED exception then Overridden method in parent should also 
//   throw same exception or its parent exception

@Override
public  void methodparent2() throws InterruptedException {
	Thread.sleep(5000);
	System.out.println("Static Method From Parent Class");
}




}
