package practice.java;

/**
 * 
 * @author sunshine
 *
 */
public class VeryBasicOOP {

	//1. Class Variables. Each Object will have their own copy of these
	String name;
	int age;
	boolean isPermanent;
	
	static String collegeName="KITS";
	
	//2. Class static variable. This will remain same for every object

	public static void main(String[] args) {

		VeryBasicOOP obj = new VeryBasicOOP(); // Default Values
		VeryBasicOOP obj2 = new VeryBasicOOP();

		obj2.name = "sumit"; // Values Changes for obj2
		obj2.age = 33;
		obj2.isPermanent = true;

		System.out.println(obj.name + " : " + obj.age + " :" + obj.isPermanent); //null : 0 :false
		System.out.println(obj2.name + " : " + obj2.age + " :" + obj2.isPermanent);//sumit : 33 :true
		
		
		System.out.println(collegeName); //KITS
		System.out.println(obj.collegeName); //Warning about static access. O/P=KITS
		System.out.println(obj.collegeName);  //Warning about static access. O/P=KITS
		

	}

}
