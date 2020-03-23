package practice.java;

public class OberloadingConflicts {

	public static void main(String[] args) {
	
		OberloadingConflicts ob=new OberloadingConflicts();
		ob.print(null); //Ambiguity as null can come from Integer as well as String
		
		// we if we remove Integer method then String will get called
		

	}

	
	public void print(Integer intg) {
		System.out.println("From String ");
		
	}


	public void print(String str) {
		System.out.println("From String ");
		
	}

	public void print(Object obj) {
		
		System.out.println("From Object ");
	}

}
