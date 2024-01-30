import java.util.Scanner;

public class BarChat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n = scn.nextInt();

        System.out.println("enter the value in the array: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        } 

        // find the maximum value in the array   
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        //print the bar graph
        for(int i=max; i>0; i--){
            for(int j=0; j<arr.length; j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

