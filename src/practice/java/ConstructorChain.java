package practice.java;

public class ConstructorChain {
	
	String business;
	int turnover;
	
	public ConstructorChain(String business,int turnover) {
		this.business=business;
		this.turnover=turnover;
		
		System.out.println("Parent Parameterised Constructor");
	}
	
	

	public ConstructorChain() {
		
		System.out.println("from Parent Default");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
