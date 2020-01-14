package practice.java;

public class AbstractWithNoMethodsMain extends AbstractWithNoMethods {
	String empName;

	public AbstractWithNoMethodsMain(int empCode,String empName) {
		super(empCode);
		this.empName=empName;
	}

	public static void main(String[] args) {

		AbstractWithNoMethodsMain main = new AbstractWithNoMethodsMain(5,"sagar");
        System.out.println(main.empCode+" "+main.empName);
        
        

	}

}
