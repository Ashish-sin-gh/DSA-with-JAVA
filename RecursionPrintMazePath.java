import java.util.Scanner;

public class RecursionPrintMazePath {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        
        System.out.print("enter the no of rows: ");
        int n = scn.nextInt();
        System.out.print("enter no of column: ");
        int m = scn.nextInt();

        printMP(1, 1, n, m, "");
    }

    public static void printMP(int sr, int sc, int dr, int dc, String paths){
        //base
        if( sr == dr && sc == dc){
            System.out.println(paths);
            return;
        }
        //horizontal
        if(sr < dr){
            printMP(sr + 1, sc, dr, dc, paths + "v");
        }

        //vertical
        if(sc < dc){
            printMP(sr, sc + 1, dr, dc, paths + "h");
        }
    }
}
