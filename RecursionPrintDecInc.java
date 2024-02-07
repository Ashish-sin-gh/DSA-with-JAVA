import java.util.Scanner;

public class RecursionPrintDecInc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n = scn.nextInt();
        System.out.println("\noutput is:");
    
        printDecInc(n);
    }

    public static void printDecInc(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecInc(n - 1);
        System.out.println(n);
    }
}
