package practice.java;

public class _INPROCESS_ArrayDeclaration {
	
	
	public static void main(String[] args) {
	
		int [][]arr={{1,2,3},{5,6,7}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		
		for(int i=0;i<arr.length;i++) {
		
			for(int j=0;j<arr[0].length;j++) {
				
				
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println("");
		}
		
		
		
		
		int[][]arr2=new int[2][3];
		
		
		for(int i=0;i<arr2.length;i++) {
			
			for(int j=0;j<arr2[0].length;j++) {
				
				arr2[i][j]=Integer.parseInt(i+""+j);
						
				//System.out.print(arr2[i][j]+" ");
				
				
			}
			//System.out.println("");
		}
		
		for(int[] ele:arr2) {
			
			System.out.print(ele+" ");
			
			
			
		}
		
		
		
		
	}
	
	

}
