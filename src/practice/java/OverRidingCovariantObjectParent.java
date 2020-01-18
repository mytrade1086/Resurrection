package practice.java;

public class OverRidingCovariantObjectParent {
	
	//# Object(Parent)===>String/Stringbuffer(Child) is okay. Reverse not allowed
	
	//Notice that getName is returning Object in Parent
	//Same method is overridden in Child with String as return type. Complier wont have any problem with that

 
	public Object getName(String name) {
		if (name == null) {
			return null;
		} else {
			return name;
		}
	}

}
