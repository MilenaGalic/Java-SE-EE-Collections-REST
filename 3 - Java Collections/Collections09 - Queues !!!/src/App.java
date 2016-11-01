import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// (head) <-- oooooooooooooooooooooooooooooooooooo <-- (tail)
		// Queue is FIFO structure - First In First Out
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(70);
		q1.add(20);
		q1.add(50);
		
		try {
			q1.add(30);
		} catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("Tried to add too many items to the Queue");
		}
		
		for(Integer value : q1) {
			System.out.println("Queue value: " + value);
		}
		
		System.out.println("Removed from queue: " + q1.remove());	
		System.out.println("Removed from queue: " + q1.remove());		
		System.out.println("Removed from queue: " + q1.remove());	
		
		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Tried to remove too many items from queue");
		}
		
		
	}
}
