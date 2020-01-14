package practice.java;

public interface IndianBankRules {
	
	
/*
 1. Only method decalaration.No Body
 2. Implementing class should override interface methods.
 3. Static method with "just declaration  not possible" in  Interfaces as implementing class can override them
 4. Interface variables are Static final by default.  We can't change that
 5. 100 percent abstraction is achieved using Interface
 6. Top casting possible using Selenium i.e Parent interface reference can hold Implementing class object
 7. For 6, only methods present inside parent interface can be accessed.
 Ex. Interface variable can be accessed in static way that is, Interface.Variable or Class.Variable
 
 8.Interface can extend Interface
 
 //default method can have body in interface
 
 
 	
 */

public int minBal=500;
public  abstract void getbalance() ;
public  abstract void setBalance() ;
default void defaultmethod() {
	System.out.println("After jdk 1.8 default was available");
	
}



}
