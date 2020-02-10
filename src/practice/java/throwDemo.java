package practice.java;

public class throwDemo {

	public static void main(String[] args) {
		
		throwDemo dm=new throwDemo();
		dm.demo(4);
		
	}

	
	public void demo(int age) {
		
		if(age<18) {
			
		throw new ArithmeticException("Age less than 18");
			
		}
		
		//Exception in thread "main" java.lang.ArithmeticException: Age less than 18
	}

}
