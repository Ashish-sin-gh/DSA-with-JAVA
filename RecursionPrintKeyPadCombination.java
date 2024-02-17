import java.util.Scanner;

public class RecursionPrintKeyPadCombination {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the keypad digits: ");
        String str = scn.next();

        printKPC(str, "");
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "nmo", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String ip , String op){
        //base case
        if(ip.length() == 0){
            System.out.println(op);
            return;
        }
        //recusion code
        char ch = ip.charAt(0);
        String roip = ip.substring(1);

        String codesforch =  codes[ch - '0'];

        for(int sChar = 0; sChar < codesforch.length(); sChar++){
            printKPC(roip, op + codesforch.charAt(sChar));
        }
    }
}
