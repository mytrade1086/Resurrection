package practice.java;

public class OverRidingCovariantObjectChild extends OverRidingCovariantObjectParent{
	
	
	
	//Notice that getName is returning Object in Parent
	// In Child with String as return type. Complier wont have any problem with that
	
	@Override
	public Object getName(String name) {

		if (name == null) {
			return null;

		} else {
			return name;

		}

	}
	
	
	public static void main(String[] args) {
		
		OverRidingCovariantObjectChild child=new OverRidingCovariantObjectChild();
		System.out.println(child.getName("From Child")); //from child
		System.out.println(child.getName(null)); //null
		
		
	}

}
