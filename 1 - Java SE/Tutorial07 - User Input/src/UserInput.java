import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a line of text: ");
		// System.out.println("Enter an integer: ");
		
		// Wait for the user to enter a line of text
		String line = input.nextLine();
		// int value = input.nextInt();
		// int value = input.nextDouble();
		
		// Tell them what they entered.
		System.out.println("You entered: " + line);
		
		// Every scanner and reader should be closed eventually 
		input.close();
			
	}

}
