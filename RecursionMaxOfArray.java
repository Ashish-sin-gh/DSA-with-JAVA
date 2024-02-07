import java.util.Scanner;

public class RecursionMaxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = scn.nextInt();
        System.out.println("enter the value for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        System.out.println("maximum is: ");
        int max = maxOfArray(arr , 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr ,  int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }

        int maxInSmallerArray = maxOfArray(arr , idx + 1);
        if(arr[idx] > maxInSmallerArray ){
            return arr[idx];
        }
        else{
            return maxInSmallerArray;
        }
    }
}
