import java.util.Scanner;

public class RecursionFactorialOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n = scn.nextInt();
        System.out.println("\noutput is:");
    
       int fact = factorial(n);

       System.out.println(fact);
    }

    public static int factorial(int n){  
        if(n == 0){
            return 1;
        }

        int ans = n * factorial(n - 1);       

        return ans;
    }
}
