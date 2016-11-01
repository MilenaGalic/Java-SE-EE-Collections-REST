import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		
		// HashSet does not retain order
		// Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remembers the order you added items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty at start!");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty at end?!");
		}
		
		// Adding duplicate items - does nothing
		set1.add("mouse");
		
		System.out.println(set1);
		
		/*
		 * Iterate trough a set
		 */
		for (String value : set1) {
			System.out.println(value);
		}
		
		if(set1.contains("aardvark")) {
			System.out.println("Contains aardvark");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Contains cat!");
		}
		
		/* 
		 * Intersection
		 */
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("moneky");
		set2.add("ant");
		
		// Common elements
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		
		// Keep only the elements that are included in both sets
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		// set2 contains some common elements with set1, and some new elements
		
		Set<String> difference = new HashSet<String>(set1);
		System.out.println(difference);
		
		// Remove
		difference.removeAll(set2);
		System.out.println(difference);
		
	}

}
