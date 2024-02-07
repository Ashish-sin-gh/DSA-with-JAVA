import java.util.Scanner;

public class RecusionPrintDec {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n = scn.nextInt();
        System.out.println("\noutput is:");
        printDec(n);
    }

    public static void printDec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }
}
