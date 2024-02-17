import java.util.ArrayList;
import java.util.Scanner;

public class RecursionMazePathWithJUMP {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number of row: ");
        int n = scn.nextInt();
        System.out.print("enter number of column: ");
        int m = scn.nextInt();

        ArrayList<String> result = getMPJ(1, 1, n, m);
        System.out.println(result);
    }

    //sc = source column
    //sr = source row
    //dc = destinaiton column
    //dr = destination column
    public static ArrayList<String> getMPJ(int sr, int sc, int dr, int dc){
        //base case
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        //create an arrayList to store paths
        ArrayList<String> paths = new ArrayList<>();

        //horizontal
        for(int step = 1; step <= dc - sc; step++){
            ArrayList<String> hpaths = getMPJ(sr, sc + step, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + step + hpath);
            }
        }

        //vertical
        for(int step = 1; step <= dr - sr; step++){
            ArrayList<String> vpaths = getMPJ(sr + step, sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + step + vpath);
            }
        }

        //digonal
        for(int step = 1; step <= dr - sr && step <= dc - sc; step++){
            ArrayList<String> dpaths = getMPJ(sr + step, sc + step, dr, dc);
            for(String dpath : dpaths){
                paths.add("d" + step +dpath);
            }
        }
        return paths;
    }
}
