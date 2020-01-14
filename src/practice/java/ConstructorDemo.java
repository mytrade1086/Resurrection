package practice.java;

public class ConstructorDemo {
	
	String name;
	int age;
	boolean isActive;
	static int id;

	/**
	 Default Constructor.
	 */
	public ConstructorDemo() {
		System.out.println("Default Constructor Call");
	}
/**
 Parameterized Constructor
 */
	public ConstructorDemo(String name, int age, boolean isActive) {
		id++;
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		System.out.println("Parameterized Constructor Call with id: " + id);
	}

	public static void main(String[] args) {
        
		ConstructorDemo cd = new ConstructorDemo("sumit", 32, true);
		System.out.println("Name is: " + cd.name + " Age is: " + cd.age + " Active:" + cd.isActive);
		ConstructorDemo cd2 = new ConstructorDemo("amit", 34, true);
		System.out.println("Name is: " + cd2.name + " Age is: " + cd2.age + " Active:" + cd2.isActive);

		ConstructorDemo cd3 = new ConstructorDemo();
		
		
		ConstructorDemo cd4 = new ConstructorDemo("sagar");
		cd4.getname();

	}
	
	
	public ConstructorDemo(String name) {
		super();
		this.name = name;
	}
	
	
	public void getname() {
		
		System.out.println("Printing name after Constructor"+name);
		
	}
	
	

}


/*When object is created, matching constructor search goes on.
If matching constructor is located code for the same is executed.
***If we have created parameterized constructors and now we try to create object with no parameters, we will get error. As java 
thinks when you can create parameterized constructor then why not create own constructor.

If class variables and variables inside Constructors(i.e Local Variables) are same then it we should use "this" keyword
# we can create constructors with limited class variables also. No need to pass every class variable

*/