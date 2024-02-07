import java.util.Scanner;

public class BrinarySearchAlgo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the length of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the value into the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("enter the data: ");
        int data = scn.nextInt();

        int low = 0;
        int high = arr.length - 1;

        while(low != high){

            int mid = (low + high) / 2;
            
            if(data < arr[mid]){
                high = mid - 1;
            }
            else if(data > arr[mid]){
                low = mid + 1;
                break;
            }
            else{
                System.out.println("the data is found in index number: " + mid);
            }
        }
        System.out.println("array dont have " + data);
    }
}
