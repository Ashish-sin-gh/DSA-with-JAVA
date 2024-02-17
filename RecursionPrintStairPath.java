import java.util.Scanner;

public class RecursionPrintStairPath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("enter the no of stairs: ");
        int n = scn.nextInt();

        printStairPath(n, "");
    }

    public static void printStairPath(int stair , String path){
        //base case
        if(stair == 0){
            System.out.println(path);
            return;
        }
        if(stair < 0){
            return;
        }
        printStairPath(stair - 1, path + "1");
        printStairPath(stair - 2, path + "2");
        printStairPath(stair - 3, path + "3");

    }
}
