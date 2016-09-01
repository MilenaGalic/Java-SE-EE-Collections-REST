import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testc = sc.nextInt();
        
        // iterate trough test cases
        for(int i = 0; i < testc; i++) {
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
       //   System.out.printf("%d %d %d \n",a,b,n);
            
            // Iterate trough single test case
            for (int j = 1; j <= n; j++) {
                int result = a;             
                
                // iterate trough each instance
                for (int k = 0; k < j; k++) {
                    result = result + (int) Math.pow(2, k)*b; 
                }
                System.out.printf("%d ",result);
            }
         System.out.printf("\n");
        }
    sc.close();
    }
}