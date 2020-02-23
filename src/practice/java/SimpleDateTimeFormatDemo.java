package practice.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateTimeFormatDemo {
	
	
	
	public static void main(String[] args) {
		
		  Date date = new Date();  
		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //
		  String strDate= formatter.format(date); // 
		  System.out.println(strDate); //23/02/2020
		 		    
		    
		
		  
		   
		   SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yy");
		   Calendar cal=Calendar.getInstance();
		   System.out.println(formatter2.format(new Date())); //23/02/20
		   
		   
		   System.out.println(cal.getTime()); //Sun Feb 23 13:28:03 IST 2020
		   System.out.println(formatter2.toLocalizedPattern()); //  dd/MM/yy
		   

		    
		    
		    
		    
	}
	

}
