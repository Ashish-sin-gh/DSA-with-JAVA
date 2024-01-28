// find the difference between the biggest and smallest no in an array 

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("enter the value in array index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("the array entered is: ");
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + "\t");
        }

        int max = arr[0];
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }

            if( min > arr[i]){
                min = arr[i];
            }
        }

        int res = max-min;
        System.out.println();
        System.out.println("answer: "+ res);
    }
}
