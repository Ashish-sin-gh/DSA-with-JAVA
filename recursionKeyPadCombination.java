import java.util.ArrayList;
import java.util.Scanner;

public class recursionKeyPadCombination {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        ArrayList<String> fRes = getKPC(str);
        System.out.println(fRes);
    }

    // global varible creation - Static keyword
    static String[]  codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yx"};

    public static ArrayList<String> getKPC(String str){
        //base case
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        //recusion code
        char ch = str.charAt(0);
        String restS = str.substring(1);
        
        ArrayList<String> oldRes = getKPC(restS);

        ArrayList<String> newRes = new ArrayList<>();
        
        String codeforch = codes[ch - '0'];
        for(int i = 0; i<codeforch.length(); i++){
            char onecharfromCodeforCh = codeforch.charAt(i);
            
            for(String one : oldRes){
                newRes.add(onecharfromCodeforCh + one);
            }
        }
        return newRes;
    }
}
