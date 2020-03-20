package practice.java;

public class DuplicateinArray {
    static int loc=0;
	public static void main(String[] args) {
		
		int count=0;
		int []test= {10,10,20,30,20,30,0};	
		
		for(int i=0;i<test.length;i++) {
			
			
			if((i==test.length-1)) {
				  loc++;
				  i=0;
				  count=0;
			}
			else if((loc==test.length)) {
				 break;
			}
			
			
			else if(test[loc]==test[i]) {
				count++;
				System.out.println("number "+test[loc] + "appears "+count+ "times");
				
			}
				
			
			
		}
		
		
	}
}
