package practice.java;

 class CustomerThread extends Thread {
	 
	 static int customerId=0;
	 
	 private static ThreadLocal tl=new ThreadLocal()
	 {
		@Override
		public Integer initialValue() {		
			return ++customerId;
		}
	};
	
	CustomerThread(String name){
		super(name);
	}
	
	public void run() {	
		System.out.println(Thread.currentThread().getName()+ " executing with customerId "+tl.get());
		
	}
}
	


public class ThreadLocalDemo3{
	public static void main(String[] args) {	
		CustomerThread t1=new CustomerThread("Thread 1");
		CustomerThread t2=new CustomerThread("Thread 2");
		CustomerThread t3=new CustomerThread("Thread 3");
		CustomerThread t4=new CustomerThread("Thread 4");		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
//		Thread 2executing with customerId 1
//		Thread 4executing with customerId 4
//		Thread 3executing with customerId 3
//		Thread 1executing with customerId 2
	}
	
}

//For every customer thread a separate customerid will be maintained by thread local object
