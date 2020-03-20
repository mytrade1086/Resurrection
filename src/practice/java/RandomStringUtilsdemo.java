

package practice.java;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringUtilsdemo {
	
	
	public static void main(String[] args) {
		RandomStringUtilsdemo rd=new RandomStringUtilsdemo();
		
		System.out.println(empName("sumit"));
		System.out.println(empSal());
		System.out.println(empAge());
		
	}

	
	public static String empName(String name) {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return (name+generatedString);
	}

	public static String empSal() {
		String generatedString = RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	
	public static String empAge() {
		String generatedString = RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}
	
}