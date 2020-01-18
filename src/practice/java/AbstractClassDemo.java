package practice.java;

public abstract class AbstractClassDemo {
	/*
	 1.Can contain Abstract and Non Abstract method
	 2.Abstract  class possible to have no method
	 3.Abstract class can contain abstract and non abstract method
	 4.Can have constructor
	 5.Object can't be created.
	 6. variable can be declared. No need to initialize it(unlike interfaces)
	 */
	
	public abstract void methodone();
	public abstract void methodtwo();
	
	public int rule;
	public  void normalMethodo() {
	System.out.println("from abstract class");
}
}