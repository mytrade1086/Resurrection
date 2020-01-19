package practice.java;

/**
 * 
 * @author sunshine For Loop and Infinie For Loop
 */
public class ForLoop {

	public static void main(String[] args) {
		
		
//#1 Init;condition;incr/decr
		for (int i = 1; i <= 10; i++) {
             System.out.println(i);}

	
		//#2 Infinite For Loop
				for (;;) {
		        System.out.println("hi");
				}
				
				//#3 For each useful in collection/array
				String []names= {"sumit","neha"};
				//Note that above line will bring unreachable code error because JVM is smart enough to know that
				//because of infinite loop we will never come into #3
			
				for(String name:names ) {			
					System.out.println(name);
				}
					}

}
