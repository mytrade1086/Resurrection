package practice.java;

public class ChildUBS extends  ParentUBS {
	String parentname;
	int parentid;
	
	
	
	public void childOne() {
		
		System.out.println("PUBLIC method from child");
	}
	
	
	
	protected void Childprotected() {
		
		System.out.println("PROTECTED method from child");
	}
	

	public static void main(String[] args) {
		
		UBSChild c=new UBSChild();
		c.parentOne();
		
		// Observations:
		c.parentExtra="somename";    
		
		
	}

}
