// Find the index no of the element in the array    
// I/P = element, array size,  array value

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("enter the element: ");
        int element = scn.nextInt();

        for(int i=0; i<arr.length; i++){
            if(element == arr[i]){
                System.out.println("element found in index number: " + i);
                break;
            }
        }
    }
}
