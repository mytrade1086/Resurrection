package practice.java;

public class InterfaceImplementBankRules implements IndianBankRules{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("getBalance implemented");
	}

	@Override
	public void setBalance() {
		// TODO Auto-generated method stub
		System.out.println("setBalance implemented");
	}
	
	public static void main(String[] args) {
		
		InterfaceImplementBankRules ir=new InterfaceImplementBankRules();
		
		
	}

}
