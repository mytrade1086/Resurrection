package practice.java;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(12);
		t.add(4);
		t.add(5);
		t.add(3);
		t.add(0);
		System.out.println(t);
		// [0, 3, 4, 5, 12] //Natural Sorting Order
			
		//We used out own comparator for descending sorting for INTEGER
		TreeSet<Integer>  t2 = new TreeSet<Integer>((new MyComparator()));
		t2.add(22);
		t2.add(4);
		t2.add(5);
		t2.add(3);
		t2.add(0);
		System.out.println(t2);  //[22, 5, 4, 3, 0]  Descending	

	
	
	TreeSet<String> s = new TreeSet<String>();
	s.add("neha");
	s.add("sumit");
	s.add("raj");
	System.out.println(s);  //[neha, raj, sumit]
	
	TreeSet<String> s2 = new TreeSet<String>(new MyComparatorStringLen()) ;
	s2.add("neha");
	s2.add("sumit");
	s2.add("raj");
	System.out.println(s2);  //[sumit, neha, raj]                Descending sorting on length
	}
	
}
class MyComparator implements Comparator<Integer> {
	//We have implemented descending order against the natural sorting order

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer obj1 = (Integer) o1;
		Integer obj2 = (Integer) o2;
		if (obj1 > obj2) {
			return -1;
		}
		else if (obj1 < obj2) {
			return 1;
		}
		else
			return 0;
	}

}



class MyComparatorStringLen implements Comparator<String> {
	//We have implemented descending order against the natural sorting order

	@Override
	public int compare(String o1, String o2) {
		
		if (o1.length() > o2.length()) {
			return -1;
		}
		else if (o1.length() < o2.length()) {
			return 1;
		}
		else
			return 0;
	}

}





