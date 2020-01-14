package practice.java;

public class ConstructorChain1 extends ConstructorChain {
	
	String childname1;
	int chilId;
	
	
	
	

	public ConstructorChain1(String business, int turnover, String childname1, int chilId) {
		super(business, turnover);
		this.childname1 = childname1;
		this.chilId = chilId;
	}

	public ConstructorChain1(String business, int turnover) {
		super(business, turnover);
		}
	
	public ConstructorChain1() {
		
		
	}

	public static void main(String[] args) {
		
		
		ConstructorChain1 c1=new ConstructorChain1("real",1000);
		System.out.println(c1.business +" "+c1.turnover);
		
		ConstructorChain1 c2=new ConstructorChain1();

	}

}
