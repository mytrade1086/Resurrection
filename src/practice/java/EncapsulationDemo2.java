package practice.java;

public class EncapsulationDemo2 {

	
public static void main(String[] args) {
	
	EncapsulationDemo ed=new EncapsulationDemo("smit",123,111);
    System.out.println( ed.name);
    System.out.println( ed.id);
    
    //Note: We dont have access to ed.Salary here as salary is declared private.
   // We got to usepublic getter setter methods created for accesing the salary variable
     System.out.println(ed.getSalary());  //111
    
    
    ed.setSalary(222);
    System.out.println(ed.getSalary()); //222
}

	}
	
	
	

