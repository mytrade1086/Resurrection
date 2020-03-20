package practice.java;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
	
		
	ThreadLocal<String> browser=new ThreadLocal<String>() {
		@Override
		public String initialValue() {
			
			return "abc";
		}
	};
	 System.out.println(browser.get());  //abc
	 browser.set("sumit");
	 System.out.println(browser.get()); //sumit
	 browser.remove();
	 System.out.println(browser.get());	//abc
	

}
	}

