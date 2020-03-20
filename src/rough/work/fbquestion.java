package rough.work;

public class fbquestion {
	
	
	
	
	public static void main(String[] args) {
		
	int [] a= {12,23,2,5,6};
	
	System.out.println(getmax(a));
	
	
		
	}

	
	public static int getmax(int[] values) {
		
		
		int max=values[0];for(int i=0;i<values.length;i++) {
			
			
			if(values[i]<max) {
				
				max=values[i];
			}
		}
		
		return max;
	}
}
