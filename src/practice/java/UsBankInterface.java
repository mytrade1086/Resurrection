package practice.java;

public interface UsBankInterface {
	
	//1 Interfaces methods must be implemented by implementing classes
	//2 public abstract by default
	
	//Marker interfaces do not have any methods. Those are special Interfaces
	//variables,if declared should be initialized. They are final by default
	//int min_bal; // says final field should be initialized
	//Abstract class does NOT have above compulsion of initializing
	
	
	///********Interfaces can have method body if method is static or default
	
	int min_bal=500;
	public void getbal();
	public void Emegencyservice911();
	
	//SPECIAL CASES	
	default void test() {
	System.out.println("Method having body in interface as its Default type");	
		}
	static  void staticmethodInterface() {
	System.out.println("Method having body in interface as its static type");	
		}
}
