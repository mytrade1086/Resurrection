package practice.java;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListReadymade {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("sumit");
		name.add("amit");
		name.add("neha");
		name.add("raj");
		System.out.println("name arrayList before Sorting:"+name);
		//name arrayList before Sorting:[sumit, amit, neha, raj]
		Collections.sort(name); //Will Sort in ASCENDING ORDER
		System.out.println("name arrayList after Sorting:"+name);
		//name arrayList after Sorting:[amit, neha, raj, sumit]
		
		
		
		ArrayList<Integer> value=new ArrayList<Integer>();
		value.add(50);
		value.add(20);
		value.add(10);
		value.add(555);
		
		System.out.println("value arrayList before Sorting:"+value);
		//value arrayList before Sorting:[50, 20, 10, 555]
				
		Collections.sort(value);
		System.out.println("value arrayList ASC Sorting:"+value);
		//value arrayList ASC Sorting:[10, 20, 50, 555]
		
		
		Collections.sort(value,Collections.reverseOrder());
		System.out.println("value arrayList after DESC Sorting:"+value);
		//value arrayList after DESC Sorting:[555, 50, 20, 10]
		
		
		

	}

}
