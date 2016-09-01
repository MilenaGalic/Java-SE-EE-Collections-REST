import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		/*
		 * There is NO GUARANTEED ORDER IN HASH MAP
		 */
		testMap(hashMap);
		/*
		 * 
		 */
		testMap(linkedHashMap);
		/*
		 * TreeMap is sorting keys in NATURAL ORDER
		 */
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(3, "Dog");
		map.put(8, "Duck");
		map.put(23, "Giraffe");
		map.put(1, "Wolf");
		map.put(346, "Swan");
		map.put(4, "Snake");
		map.put(7, "Bull");
		map.put(71, "RedBull");
		
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
