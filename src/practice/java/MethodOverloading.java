package practice.java;

public class MethodOverloading {

	public static void main(String[] args) {
		
		//Inside same class two methods with different arguments

		MethodOverloading movl = new MethodOverloading();

		movl.login();
		movl.login("sumit", "password");
		movl.login(123);
	}

	public static void login(String dummy) {
		// s
		System.out.println("Static login method with dummy");
	}

	public static double login(double dummy) {
		System.out.println("Static login method with dummy");
		return 0;
	}

	public void login() {

		System.out.println("Methos with no paramaters");
	}

	public void login(String Username, String password) {

		System.out.println("Methos with paramaters");
	}

	public int login(int loginidnum) {

		System.out.println("Methos with loginidnum: " + loginidnum);

		return loginidnum;
	}

}

/*
 * Methos with no paramaters Methos with paramaters Methos with loginidnum: 123
 * 
 */
