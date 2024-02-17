import java.util.ArrayList;
import java.util.Scanner;

public class RecursionGetMazePath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("enter row: ");
        int n = scn.nextInt();
        System.out.print("enter column: ");
        int m = scn.nextInt();

        ArrayList<String> result = getMazePath(n , m , 1 , 1);
        System.out.println(result);
    }
    
    //sc = source column
    //sr = source row
    //dc = destinaiton column
    //dr = destination column
    public static ArrayList<String> getMazePath(int dr, int dc, int sr, int sc){
        //base case
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> horizontal = new ArrayList<>();
        ArrayList<String> vertical = new ArrayList<>();

        if(sr < dr){
            vertical = getMazePath(dr, dc, sr + 1, sc);
        }
        if(sc < dc){
            horizontal = getMazePath(dr, dc, sr, sc + 1);
        }
        
        ArrayList<String> finalPaths = new ArrayList<>();

        for(String hpath : horizontal){
            finalPaths.add("h" + hpath);
        }
        for(String vpath : vertical){
            finalPaths.add("v" + vpath);
        }

        return finalPaths;
    }
}
