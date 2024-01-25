import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no of no to check: ");
        int t = sc.nextInt();

        int count = 0;
        
        for (int i=1; i<=t; i++){
            System.out.print("enter the " + i + " number: ");
            int n = sc.nextInt();

            for (int div=2; div*div<=n; div++){
                if(n%div == 0)
                    count++;
                    break; 
            } 
            if(n == 1)
                System.out.println("NOT PRIME");
            else if(count == 0)
                System.out.println("PRIME");
            else    
                System.out.println("NOT PRIME");
        }
    }
}
