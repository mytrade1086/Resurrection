package practice.java;

public class WideningNarrowing {
	
	
	public static void main(String[] args) {
		
		int data=12;
		double ddata=data;  
		System.out.println(ddata);
		//Note that when you WIDEN from (int to double)complier automatically takes care of it
		//i.e no need to write  =(double)data
		
		//byte=>short->int-long-float-double
		
		
		//Note that when you NARROW from (double to int)complier automatically takes care of it
		//i.e no need to write  =(double)data
			double val=12.19;
	//*	int j= val; //compiler shows CE and suggests writing (int)val
		int i=(int)val;
		System.out.println(i); //12
	
	}

}
