import java.util.Scanner;

public class RecursionPrintMazePathJump {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the no of rows: ");
        int n = scn.nextInt();
        System.out.print("enter the no of columns: ");
        int m = scn.nextInt();

        printMPJ(1, 1, n, m, "");
    }

    public static void printMPJ(int sr, int sc, int dr, int dc, String paths){
        //base case
        if(sr == dr && sc == dc){
            System.out.println(paths);
            return;
        }

        //horizontal
        for(int i = 1; i <= dc - sc; i++){  //i is steps thet i can jump
            printMPJ(sr, sc + i, dr, dc, paths + "h" + i);
        }
        //vertical
        for(int i = 1; i <= dr - sr; i++){  //i is steps thet i can jump
            printMPJ(sr + i, sc, dr, dc, paths + "v" + i);
        }
        //digonal
        for(int i = 1; i <= dc - sc && i <= dr - sr; i++){  //i is steps thet i can jump
            printMPJ(sr + i, sc + i, dr, dc, paths + "d" + i);
        }
    }
}
