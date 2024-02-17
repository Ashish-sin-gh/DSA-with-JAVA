import java.util.Scanner;

public class RecursionPrintEncoding {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the string: ");
        String str = scn.next();

        printEncoding(str, "");
    }

    public static void printEncoding(String str, String op){
        if(str.length() == 0){
            System.out.println(op);
            return;
        }

        else if(str.length() == 1){
            char ch = str.charAt(0);

            if(ch == '0'){
                return;
            }
            else{
                int  chVal = ch - '0';
                char code = (char)('a' + chVal - 1);
                op = op + code;
                System.out.println(op);
            }
        }

        else{
            char ch = str.charAt(0);
            String ros = str.substring(1);

            if(ch == '0'){
                return;
            }
            else{
                int chVal = ch - '0';
                char code = (char)('a' + chVal - 1);
                printEncoding(ros, op + code);
            }

            String ch12 = str.substring(0, 2);
            String ros12 = str.substring(2);

            int ch12Val = Integer.parseInt(ch12);
            if(ch12Val <= 26){
                char code = (char)('a' + ch12Val - 1);
                printEncoding(ros12, op + code);
            }
        }
    }   
}
