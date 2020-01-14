package practice.java;

/**
 * 
 * @author sunshine
 *
 */
public class VeryBasicOOP {

	// Class Variables. Each Object will have their own copy of thsese
	String name;
	int age;
	boolean isPermanent;

	public static void main(String[] args) {

		VeryBasicOOP obj = new VeryBasicOOP(); // Default Values
		VeryBasicOOP obj2 = new VeryBasicOOP();

		obj2.name = "sumit"; // Values Changes for obj2
		obj2.age = 33;
		obj2.isPermanent = true;

		System.out.println(obj.name + " : " + obj.age + " :" + obj.isPermanent); //null : 0 :false
		System.out.println(obj2.name + " : " + obj2.age + " :" + obj2.isPermanent);//sumit : 33 :true
		
		

	}

}
