package practice.java;

public class Scope {

	public int nonstaticVariable;
	static public int staticVariable ;
	public static void main(String[] args) {

		int method=0;
		
		if(method>0) {
		int flag=1;
		System.out.println(flag);
		}
		
		else if(flag==1){ // flag wont be available to else if or outside if
			int elseflag=1;		
		}
		
	System.out.println(nonstaticVariable);   // static method can access staic variables
	System.out.println(staticVariable);  //works
	System.out.println(method); //works
	System.out.println(flag); //does not work.
		
		
		

	}

}
