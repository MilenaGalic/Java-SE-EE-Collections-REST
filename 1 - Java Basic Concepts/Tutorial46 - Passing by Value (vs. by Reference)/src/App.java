
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App app = new App();
		
		// Names of variables and names of function's arguments are NOT connected 
		// we can have same name, it's not important
		
		int value = 7;
	
		System.out.println("Value is: " + value);
		
		// Passing by Value
		app.show(value);
		
		System.out.println("Value is: " + value);
		

	}
	
	public void show(int value) {
		
		System.out.println("Value is: " + value);
		
		value = 8;
		
		System.out.println("Value is: " + value);
	}

}
