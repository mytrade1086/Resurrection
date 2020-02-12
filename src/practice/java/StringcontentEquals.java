package practice.java;

public class StringcontentEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1="sumit";
		String name2="amit";
		String name3="sumit";
		
		
		System.out.println("Used contentEquals method "+name1.contentEquals(name2));
		System.out.println("Used .equals method "+name1.equals(name2));
//		Used contentEquals method false
//		Used .equals method false
		
		
		System.out.println("Used contentEquals method "+name1.contentEquals(name3));
		System.out.println("Used .equals method "+name1.equals(name3));
		
//		Used contentEquals method true
//		Used .equals method true
		
		
		
				

	}

}
