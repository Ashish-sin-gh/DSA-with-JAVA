import java.util.Scanner;

public class RecursionKnightsTour {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of chess board: ");
        int n = scn.nextInt();
        System.out.print("enter intial row position of the knight: ");
        int r = scn.nextInt();
        System.out.print("enter intial column position of the knight: ");
        int c = scn.nextInt();

        int[][] chess = new int[n][n];

        printKnightTour(chess, r, c, 1);
    }

    public static void printKnightTour(int[][] chess, int row, int col, int moveNumber){
        if(row < 0 ||  col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0){
            return;
        }
        else if( moveNumber == chess.length * chess.length){
            chess[row][col] = moveNumber;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }

        chess[row][col] = moveNumber;
        printKnightTour(chess, row - 2, col + 1, moveNumber + 1);
        printKnightTour(chess, row - 1, col + 2, moveNumber + 1);
        printKnightTour(chess, row + 1, col + 2, moveNumber + 1);
        printKnightTour(chess, row + 2, col + 1, moveNumber + 1);
        printKnightTour(chess, row + 2, col - 1, moveNumber + 1);
        printKnightTour(chess, row + 1, col - 2, moveNumber + 1);
        printKnightTour(chess, row - 1, col - 2, moveNumber + 1);
        printKnightTour(chess, row - 2, col - 1, moveNumber + 1);
        chess[row][col] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess.length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


