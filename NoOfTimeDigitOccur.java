import java.util.Scanner;

public class NoOfTimeDigitOccur {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        System.out.print("enter digit ot be checked for: ");
        int digit = sc.nextInt();
       
        int newn = 0;
        int count = 0;

        while(n != 0){
            newn = n%10;
        
            if( digit == newn){
                count++;
            }

            n = n/10;
        }

        System.out.println("no of " + digit + " are: " + count);

    }
}
