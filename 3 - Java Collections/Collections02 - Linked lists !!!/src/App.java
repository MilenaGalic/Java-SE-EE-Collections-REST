import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		/* 
		 * Only time when we need to consider specific type of list is when we instance it , new [type]List<>();
		 * 
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
		*/
		
		/*
		 * ArrayLists manage arrays internally.
		 * [0][1][2][3][4][5]....[n-1][n]
		 * 
		 * 
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]->[3]->....->...[n-1]->[n]
		 *    <-   <-   
		 *    
		 * If we want to add or remove items in the beginning or in the middle 
		 * of list, we should use Linked List.
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList",  linkedList);
		
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		for( int i = 0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/* add items at the end of the list
		for (int i = 0; i < 2E5; i++) {
			list.add(i);
		}
		*/
		
		/*
		 * Add items elswhere in list
		 */
		for(int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		 
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for type " + type);
	}

}
