import java.util.Scanner;

public class RecursionPrintSubSequence {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the character: ");
        String str = scn.next();

        printSS(str, "");
    }

    public static void printSS(String input, String output){
        //base case
        if(input.length() == 0){
            System.out.println(output);
            return;
        }

        char ch = input.charAt(0);
        String restOfInput = input.substring(1);

        printSS(restOfInput, output + ch);
        printSS(restOfInput, output + "");
    }
}
