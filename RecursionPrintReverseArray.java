import java.util.Scanner;

public class RecursionPrintReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = scn.nextInt();
        System.out.println("enter the value for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        System.out.println("output is: ");
        displayArray(arr , 0);   
    }

    public static void displayArray( int[] arr , int index){
        if( index == arr.length){
            return;
        }

        //System.out.println(arr[arr.length - index - 1]);
        displayArray(arr, index + 1);
        System.out.println(arr[index]);
    }
}

