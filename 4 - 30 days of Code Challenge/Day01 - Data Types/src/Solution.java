import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

    /* Declare second integer, double, and String variables. */
    int i_sec;
    double d_sec;
    String s_sec;

    /* Read and save an integer, double, and String to your variables.*/
    i_sec = scan.nextInt(); scan.nextLine();
    d_sec = scan.nextDouble(); scan.nextLine();
    s_sec = scan.nextLine();

    /* Print the sum of both integer variables on a new line. */
    System.out.println(i + i_sec);

    /* Print the sum of the double variables on a new line. */
    System.out.println(d + d_sec);
	
    /* Concatenate and print the String variables on a new line; 
    	the 's' variable above should be printed first. */
    System.out.println(s + s_sec);
    
    scan.close();
}
}
