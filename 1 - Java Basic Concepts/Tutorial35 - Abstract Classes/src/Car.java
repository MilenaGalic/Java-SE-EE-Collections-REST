// Child class Car, from parent class Machine
public class Car extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting car.");
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Do stuff in car.");
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Shutdown car.");
		
	}

}
