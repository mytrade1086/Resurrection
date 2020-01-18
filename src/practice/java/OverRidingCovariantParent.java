package practice.java;

public class OverRidingCovariantParent {

	//Note that Parent getSal has int return type and child has short.
	//Its not allowed unline Object==>String/stringBuffer
	@Override   
	public short getsal(int sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	
	
}
