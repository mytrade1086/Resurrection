package rough.work;

class MultiThreading extends Thread{  
	
	  public void run(){  
	    System.out.println("My thread is in running state.");  
	    
	    for(int i=0;i<10;i++) {  	
	    	System.out.println(i);
	    	
	    	System.out.println("currently running htread is :"+Thread.currentThread().getName());
	    }
	    
	    
	  }  
	  
	  
	  public static void main(String args[]){  
		 MultiThreading obj=new MultiThreading();
		 
		 
	     obj.start(); 
	     
	     for(int i=100;i<111;i++) {  	
		   System.out.println(i);
	     }
	     
	     System.out.println("currently running htread is :"+Thread.currentThread().getName());
	  }  
	}