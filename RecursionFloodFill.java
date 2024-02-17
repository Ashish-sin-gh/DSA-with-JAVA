import java.util.Scanner;

public class RecursionFloodFill {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the no of rows: ");
        int n = scn.nextInt();

        System.out.println("enter the no of columns: ");
        int m = scn.nextInt();

        System.out.println("enter values in the array (0/1): ");
        int[][] arr2D = new int[n][m];
        for(int r = 0; r < arr2D.length; r++){
            for(int c = 0; c < arr2D[0].length; c++){
                arr2D[r][c] = scn.nextInt();
            }
        }
        
        boolean[][] visited = new boolean[n][m];

        printFloodFill(arr2D, 0, 0, "", visited);
    }

    public static void printFloodFill(int[][] maze, int row, int col, String str, 
    boolean[][] visited){
        //base case - smart
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || 
        maze[row][col] == 1 || visited[row][col] == true){
            return;
        }
        
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(str);
            return;
        }

        //calls - normal
        visited[row][col] = true;
        //top
        printFloodFill(maze, row - 1, col, str + "t", visited );
        //left
        printFloodFill(maze, row, col - 1, str + "l", visited);
        //right
        printFloodFill(maze, row, col + 1, str + "r", visited);
        //down
        printFloodFill(maze, row + 1, col, str + "d", visited);

        visited[row][col] = false;
    }
}
