package practice.java;

import java.util.Iterator;
import java.util.Set;

public class systemgetProperty {

	public static void main(String[] args) {
		
		
		System.out.println(System.getenv("CLASSPATH"));
		System.out.println(System.currentTimeMillis());
		
		Set<String> var= System.getenv().keySet();
		
		Iterator<String>str=var.iterator();
		
		
		while(str.hasNext()) {
			
			System.out.println( str.next()+" : "+System.getenv().get(str.next()));
		}
		
		
		
//		C:\Program Files\Java\jdk1.8.0_211\lib
//		1583655301690
		

	}

}
