package practice.java;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
	
		
	ThreadLocal<String> browser=new ThreadLocal<String>();
	 
	 System.out.println(browser.get());
	 browser.set("sumit");
	 System.out.println(browser.get()); 
	 browser.remove();
	 System.out.println(browser.get());	
	}

}
