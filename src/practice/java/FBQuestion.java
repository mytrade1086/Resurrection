package practice.java;

//#1 see we have parameterized constructor without having class variable. It still works
//#2 

  class Temp {
   
	 private Temp(int data)
     {
         System.out.printf(" Constructor called ");
     }
    
     protected static Temp create(int data)
     {
    	 Temp obj = new Temp(data);
         return obj;
     }
     public void myMethod()
     {
         System.out.printf(" Method called ");
     }
 }
   class FBQuestion
 {
     public static void main(String[] args){
         Temp obj = Temp.create(20); 
         obj.myMethod();
     }
 }
  
   //Constructor called  Method called