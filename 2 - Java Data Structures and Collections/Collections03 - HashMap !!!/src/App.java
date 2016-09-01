import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(23, "Twentythree");
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(2, "Two");
		
		String text = map.get(8);
		System.out.println(text);
		
		/*
		 * Iterating trough map
		 * HASHMAP DOES NOT MAINTAIN ORDER !!! 
		 */
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
			
		}
		
	}
}
