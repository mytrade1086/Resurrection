package practice.java;

public class ReturnNull {
	
	public static void main(String[] args) {
		
		//char,Object,String/StringBuffer would allow null as a return value
		
		ReturnNull rn=new ReturnNull();
		
		rn.name("");  //Returned null as string was empty
		 // rn.name(); //not allowed
	}
	
	
	public String name(String sname) {
		
		if(sname.trim().isEmpty()) {
			System.out.println("Returned null as string was empty");
			return null;   //As String Default is null. This would work
		}
		
		else
		{
			return sname.trim();
		}
		
	}

}
