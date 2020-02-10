package practice.java;

public class AbstractClassNoMethodNoConstructorMain extends AbstractClassNoMethodNoConstructor {

	public static void main(String[] args) {
		
		AbstractClassNoMethodNoConstructorMain m=new AbstractClassNoMethodNoConstructorMain();
		m.min_bal=500;
		
		System.out.println(m.min_bal); //500
		
		System.out.println(m.activity); //90
		
		//m.activity=300; //not allowed as activity is final variable
		
		System.out.println(max_Withdrawl);
		
		System.out.println(m.dummy); //0 default value of int

	}

}
