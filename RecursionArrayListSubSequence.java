import java.util.ArrayList;
import java.util.Scanner;

public class RecursionArrayListSubSequence {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter String value: ");
        String str = scn.next();  //string input = abc
       
        ArrayList<String> result = getSS(str);  // call and stored the output in arraylist
        System.out.println(result);
    }

    public static ArrayList<String> getSS(String str){
        if(str.length() == 0 ){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);                             // a
        String restOfString = str.substring(1);         // bc
        ArrayList<String> lastRecursion = getSS(restOfString);     // [--, -c, b-, bc]

        ArrayList<String> newRecursion = new ArrayList<>();        // [] empty arratlist created

        for(String oneChar : lastRecursion){
            newRecursion.add("-" + oneChar);                        // 
        }
        for(String oneChar : lastRecursion){
            newRecursion.add(ch + oneChar);
        }
        return newRecursion;
    }
}
