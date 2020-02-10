package practice.java;

public class UBS2 {

	public static void main(String[] args) {
		
		B b=new C();
		A1 a=b;
		System.out.println(a instanceof A);// true
		System.out.println(a instanceof B);//true
		System.out.println(a instanceof C);//true
		System.out.println(a instanceof D);//false
		

	}

}

class A1{}

class B extends A1{}
class C extends B{}
class D extends C{}


