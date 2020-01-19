package practice.java;

public class SystemOutPrintmain {
	public static myPrintStream out;

	
	public static void main(String[] args) {
		
		out=new myPrintStream(); //without this null pointer exception will come
		SystemOutPrintmain.out.myprintln();
		
		
		
}

}

class myPrintStream {
	public void myprintln() {
		System.out.println(" inside println");}
	}
	

