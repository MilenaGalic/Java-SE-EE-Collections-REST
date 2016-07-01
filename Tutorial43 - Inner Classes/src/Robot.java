
public class Robot {
	
	private int id;
	
	// When we need to group some functionality 
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	// Static in a inner-classes is used where we want a normal class which isnt associated with instances
	static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
	}
}
