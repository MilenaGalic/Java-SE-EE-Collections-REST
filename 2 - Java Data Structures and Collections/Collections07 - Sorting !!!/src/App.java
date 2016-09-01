import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Sorting is done with Comparator
 */
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int len1 = o1.length();
		int len2 = o2.length();
		
		if (len1 > len2) {
			return 1;
		} 
		else if (len1 < len2) {
			return -1;
		}
		
		
		return 0;
	}
	
}

/*
 * Sorting in alpgabetical order
 */
class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

/*
 * Sorting in alpgabetical order
 */
class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

public class App {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		
		// Collections.sort(animals)
		// Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		/*
		 * Sorting integers
		 */
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(1);
		numbers.add(34);
		numbers.add(73);
		numbers.add(11);
		numbers.add(-62);
		
		Collections.sort(numbers);
		
		for(Integer number : numbers) {
			System.out.println(number);
		}
	
	}
}
