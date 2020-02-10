package practice.java;

public abstract class AbstractClassDemo {
	/*
	 1.Can contain Abstract and Non Abstract method
	 2.Abstract  class possible to have no method
	 3.Abstract class can contain abstract and non abstract method
	 4.Can have constructor
	 5.Object can't be created.
	 6.Variable can be declared. No need to initialize it(unlike interfaces)
	 7.Declared variable is not final unlike Interfaces
	 */
	
	public abstract void methodone();
	public abstract void methodtwo();
	
	public int rule; //notice that its not necessary for variable to be final
	public  void normalMethodo() {
	System.out.println("from abstract class");
}
}