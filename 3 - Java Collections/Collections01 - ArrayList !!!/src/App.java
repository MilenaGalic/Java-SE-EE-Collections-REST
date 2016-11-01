import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// ArrayList can't accept primitive types! So, only NON-PRIMITIVE types, classes...
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Adding values
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		// Indexed for loop iteration
		System.out.println("\nIteration 01: ");
		for(int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// Remove from ArrayList - this is FAST remove
		numbers.remove(numbers.size() - 1);
		
		// This is VERY slow remove
		numbers.remove(0);
		
		// Iteration
		System.out.println("\nIteration 02: ");
		for(Integer value : numbers) {
			System.out.println(value);
		}
		
		// List interface ...
		List<String> values = new ArrayList<String>();
		System.out.println("\n" + values);
		
	}
}
