import java.util.Scanner;

public class RecursionPrintPermutationOfCharacter {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = scn.next();        //abc

        printPOC(str, "");     
    }

    public static void printPOC(String str, String output){  //(abc,"")  (bc, "a")
        //base case
        if(str.length() == 0){
            System.out.println(output);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);                        //a b

            //rest of string left of the ch
            String rosL = str.substring(0, i);              //bc
            //rest of string right of the ch
            String rosR = str.substring(i + 1);
            //combine left and right string to get total rest of string
            String ros = rosL + rosR; 

            printPOC(ros, output + ch);                     
        }
    }
}
