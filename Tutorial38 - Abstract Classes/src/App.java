
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		car1.run();
		
		/* 	We might decide we don't actually need instances (objects) of parent class
			In that case, we want to set Machine class to abstract class 
			
			Machine machine1 = new Machine(); <-- we won't use this, it will throw error
		*/
	}

}
