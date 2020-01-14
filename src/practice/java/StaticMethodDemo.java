package practice.java;

public class StaticMethodDemo {
	
	public static int  id;
	public String name;
	
	public static void main(String[] args) {
		
		StaticMethodDemo obj=new StaticMethodDemo();
		run();
		obj.runNonstatic();	
	}
	
	public static void  run() {
		
		System.out.println("Static Method Call");
		id=10; //static variables can be accessed directly inside static /non static methods
	//	name="sumit" cant access normal class variable without object
		
	}
	
	public  void  runNonstatic() {
	
		System.out.println("Non Static Static Method Call");
		id=10;
		//name=10; //	name="sumit" cant access normal class variable without object
		
	}
	

}


//Static methpd/member stored in Static Area
//Non static methods/Objects on Heap Area