package practice.java;

public class OverRidingCovariantChild extends OverRidingCovariantParent{
	
	@Override
	public short getsal(short sal) {
		System.out.println("Salary is "+sal);
		return sal;
	}

}
