package practice.java;

public class HashCodePlay {
	
	
	public static void main(String[] args) {
		
		//HashCode is not unique identifier of the object
		String s1="FB";
		String s2="Ea";
		
		String s3="sagar";
		String s4="sagar";
		
		System.out.println(s1.hashCode()+" "+s2.hashCode()); //2236 2236
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //false
		
		
		
	    System.out.println(s3.hashCode()+" "+s4.hashCode()); //109196746 109196746
		System.out.println(s3==s4); //true
		System.out.println(s3.equals(s4)); //true
				
				
	}

}
