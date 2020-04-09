package practice.java;

public class GenericClassDemo {

	public static void main(String[] args) {

		StringDataClass dc = new StringDataClass();
		dc.setMydata("neha");
		System.out.println("Normal Class " + dc.getMydata());

		GenericDataClass<Integer> gdc = new GenericDataClass<Integer>();
		gdc.setMydata(10);
		System.out.println("Passed Integer " + gdc.getMydata());

		GenericDataClass<String> gdc2 = new GenericDataClass<String>();
		gdc2.setMydata("Sagar");
		System.out.println("Passed String " + gdc2.getMydata());

	}

}

//#  Normal Class . If have String variable and String getter/setter
// Limitation is only can handle String input
class StringDataClass {

	String data;

	public void setMydata(String str) {
		data = str;
	}

	public String getMydata() {
		return data;
	}

}

//#  Generic Class .  Can handle any type of data(Except Primitive)getter/setter
//Limitation is only can handle String input

//Notice that class name followed by <T>
//We can have multiple <T,T>
//Object creation will be like GenericDataClass<Integer> gdc = new GenericDataClass<Integer>();



class GenericDataClass<T> {
	T data;
	
	public void setMydata(T str) {
		data = str;
	}

	public T getMydata() {
		return data;
	}

}
