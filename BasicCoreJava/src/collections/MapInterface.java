package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("name1", "Anjali");
		map.put("name2", "Santosh");
		map.put("name3", "Subhangi");
		map.put("null", "Anand");
		System.out.println(map.get(null));
		
       Map<Integer, String> map1 = new HashMap<>(); // Hashtable is legacy class so will not allow null key
		
		map1.put(1, "Anjali");
		map1.put(2, "Santosh");
		map1.put(3, "Subhangi");
		map1.put(4, "Anand");
		
		
System.out.println(map1.get(2));

Set<String> set = map.keySet();
for (String s: set)
{
	System.out.println(map.get(s));
}
	}

}
