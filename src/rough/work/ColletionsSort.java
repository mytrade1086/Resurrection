package rough.work;

import java.util.ArrayList;
import java.util.Collections;

public class ColletionsSort {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("cat");
		al.add("bas10");
		al.add("abc");
		
		Collections.sort(al);
		
		System.out.println(al); //[abc, bas10, cat]
		ArrayList<String> b=new ArrayList<String>();
		b.add("acat");
		b.add("zbas10");
		b.add("aabc");
		
		
		Collections.sort(b,Collections.reverseOrder());
		
		System.out.println(b);//[zbas10, acat, aabc]
		
		

	}

}
