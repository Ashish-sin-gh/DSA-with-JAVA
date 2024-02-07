import java.util.Scanner;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter x: ");
        int x = scn.nextInt();
        System.out.print("enter n: ");
        int n = scn.nextInt();

        System.out.print("\npower is: ");
        int p = power(x, n);
        System.out.print(p);
    }

    public static int power(int x ,  int n){
        if(n == 0){
            return 1;
        }
        int pow = x * power(x, n - 1);

        return pow;
    }
}
