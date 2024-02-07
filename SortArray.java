import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values into the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
