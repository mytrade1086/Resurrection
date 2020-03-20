package practice.java;

interface demo1 {
	public void method1();
	public void method2();
}

interface demo2 {
	public void method1();
	public void method2();
}

 class ImplementInterface implements demo1 {
	@Override
	public void method1() {
		System.out.println("Called method1 from demo1 interface");
	}

	@Override
	public void method2() {
		System.out.println("Called method1 from demo2 interface");
	}
}

 
 public class ReturnInterfaceReference{
	 
	 public static void main(String[] args) {
		 
		 demo1 t=ReturnInterfaceReference.dummy1();
		t.method1();
	}
	 
	 
	 public static demo1 dummy1() {
		return new ImplementInterface();
		 
	 }
	 
	
 }





