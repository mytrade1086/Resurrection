package practice.java;
public class InheritanceChild extends InheritanceParent  {

private InheritanceChild(String pdata) {
		super(pdata);
		System.out.println("Passed to Constructor in Child class :"+pdata);
	}

	private void privatemethodchild() {
		System.out.println("Private method in Child ");
	}
	
public void start() {
		
		System.out.println("Start method in Child ");
	}

public void stop() {
	
	System.out.println("stop method in Child ");
}




public static void main(String[] args) {
	InheritanceParent p=new InheritanceParent("sumit");
	InheritanceParent pp1=new InheritanceParent(68);
	InheritanceChild c=new InheritanceChild("Amit");
	
	InheritanceParent p1=new InheritanceChild("Neha");  //Top Casting.  
	
	p1.start();
	p1.stop();
	p1.parentmethodone();
	
	//p.parentmethodone();
	
}

}
