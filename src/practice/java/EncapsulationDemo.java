package practice.java;

public class EncapsulationDemo {
	
	/*
	 * Encapsulation in Java is a process of wrapping code and data together into a
	 * single unit, for example, a capsule which is mixed of several medicines.
	 * encapsulation in java We can create a fully encapsulated class in Java by
	 * making all the data members of the class private. Now we can use setter and
	 * getter methods to set and get the data in it.
	 */
    
	String name;
	int id;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public EncapsulationDemo(String name,int id,int salary) {	
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	public static void main(String[] args) {
		EncapsulationDemo ed=new EncapsulationDemo("sumit",123,10000);
		System.out.println(ed.name+" "+ed.id+" "+ed.salary); //sumit 123 10000
	}
	
}
