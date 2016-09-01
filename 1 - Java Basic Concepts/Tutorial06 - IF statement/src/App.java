
public class App {
	
	public static void main(String[] args) {
		
			// Compare equality with ==
	        System.out.println(5 == 7);
	        
	        // Compare non equality with !=
	        System.out.println(10 != 11);
	        
	        // Compare less then with <
	        System.out.println(3 < 6);
	        
	        // Compare larger then with >
	        System.out.println(10 > 100);
	        
	        // Using loops with "break": 
	        int loop = 0;
	        
	        while(true) {
	            System.out.println("Looping: " + loop);
	            
	            if(loop == 3) {
	                break;
	            }
	            
	            loop++;
	        
	            System.out.println("Running");
	        }
	    }
}
