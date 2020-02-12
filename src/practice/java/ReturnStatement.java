package practice.java;

public class ReturnStatement {

//	if function is returning something, complier makes sure that return code is reachable
//Once return is met, code written after first return in unreachavble
	
	public static void main(String[] args) {	
		ReturnStatement r=new ReturnStatement();
		System.out.println(""+r.returntest(6,5));
	}
	 public int returntest(int a,int b) {	
		if(a>b) {
			return 11;		
		}
		else 
		{		
			return 12;	
		}
		//System.out.println("after if else");   //UNREACHABLE CODE
		// return 13;
	}
}
