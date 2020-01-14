package practice.java;

public class EncapsulationDemo {
    
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
