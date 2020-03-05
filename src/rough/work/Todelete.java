package rough.work;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Todelete {

	public static void main(String[] args) {

		String[] str = { "a", "b", "c", "d", "a", "f", "c" };
		Map<String, Integer> hm1 = new HashMap<String, Integer>();
		for (String s : str) {
			hm1.put(s, 0);
		}
	
		Set<Entry<String, Integer>> ehm1 = hm1.entrySet();
		for (Entry<String, Integer> esi : ehm1) {
			System.out.println(esi.getKey() + " " + esi.getValue());
		}
		Map<String, Integer> hm2 = new HashMap<String, Integer>();
		for (String s : str) {
			//int count=0;
			
			Integer nc = hm2.put(s, null);
			if (nc == null) {
				nc=1;
				hm2.put(s,nc );
			}
			else {
				hm2.put(s, ++nc);
			}
		}
		System.out.println(hm2);
	}
}
