package practice.java;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb=new StringBuffer("test");
		sb.append(" is ");
		System.out.println(sb); //test is 
		
	
		StringBuffer sb5=new StringBuffer("this is sb5");
		StringBuffer sb6=new StringBuffer("this is sb6");
		
		sb6=sb5.append(sb6);  //it will change sb5 also
		
		System.out.println(sb5);
		//this is sb5this is sb6
		
		
		System.out.println(sb6);
		//this is sb5this is sb6
		
		
		
		

	}

}
