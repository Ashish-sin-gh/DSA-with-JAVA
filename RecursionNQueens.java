import java.util.Scanner;

public class RecursionNQueens {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //n - row | n - col | n - queens
        System.out.println("enter n: ");  
        int n = scn.nextInt();

        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String str, int row){
        if(row == chess.length){
            System.out.println(str + ".");
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isthePlaceSafeForQueen(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, str + row + "-" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isthePlaceSafeForQueen(int[][] chess, int row, int col){
        //vertial check
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        //digonal left check
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        //digonal right check
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
