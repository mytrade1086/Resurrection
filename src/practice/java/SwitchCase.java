package practice.java;

/**
 * 
 * @author sunshine
 * Created For Learning Switch Case
 */
public class SwitchCase {
	/**
	 * 
	 * @param args
	 */

	 //We should write break after our case. Else it goes for execution of next case also
	// ex: if break not written after case 10, it will print below output
	//	  Inside Case 10
    //	  Inside Case 20
	
	//If nothing matched ,default case gets executed
	public static void main(String[] args) {

		int num=10;
		
		switch(num) {
		
		case 10:

			System.out.println("Inside Case 10");
			break;
			
		case 20:
			System.out.println("Inside Case 20");
			break;
		default:
			
			System.out.println("Inside Default Case");
			break;
		
		}
				
		

	}

}
