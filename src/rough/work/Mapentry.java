package rough.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapentry {

	public static void main(String[] args) {
	
		
		Map <String,String> data= new  HashMap<String,String>();
		
		data.put("name", "Sumit");
		data.put("college", "kits");
		data.put("branch", "it");
		data.put("rollno", "k4766");
	
		
		Set<Entry<String,String>> es =data.entrySet();
		
		for(Entry<String, String> em:es) {
			
		System.out.println("Key is "+em.getKey()+" Value is:"+em.getValue());
			
		}
		

	}

}
