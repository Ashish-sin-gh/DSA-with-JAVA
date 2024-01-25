import java.util.Scanner;

public class CountDigitInANumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int count = 0;

        while(n != 0){
            count++;
            n = n/10;
        }
        System.out.println("the no of digits are: " + count);
    }
}
