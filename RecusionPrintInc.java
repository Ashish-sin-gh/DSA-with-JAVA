import java.util.Scanner;

public class RecusionPrintInc {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n = scn.nextInt();
        System.out.println("\noutput is:");
    
        printInc(n);
    }

    public static void printInc(int n){
        if(n == 0){
            return;
        }
        
        printInc(n - 1);
        System.out.println(n);
    }

}
