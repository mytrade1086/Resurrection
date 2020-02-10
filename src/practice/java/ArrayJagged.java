package practice.java;
import java.util.Arrays;

public class ArrayJagged {

	public static void main(String[] args) {

		int[][] twoDimension=new int[3][];

		// first row has 3 columns
		twoDimension[0] = new int[3];

		// second row has 2 columns
		twoDimension[1] = new int[2];

		// third row has 3 columns
		twoDimension[2] = new int[3];
		
		
		  int counter = 0;
	      //initializing array
	      for(int row=0; row < twoDimension.length; row++){
	   
	         for(int col=0; col < twoDimension[row].length; col++){
	        	 twoDimension[row][col] = counter++;
	         }    
	      }
	      
	      


	      for(int[]arr:twoDimension) {
	    	  
	    	  for(int j:arr) {
	    		  System.out.print(j+" ");
	    	  }
	    	  System.out.println("");
	      }

	      
//	      0 1 2 
//	      3 4 
//	      5 6 7 
	}
}
