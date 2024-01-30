import java.util.Scanner;

public class ReverseArrayWay2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("size of the array: ");
        int n = scn.nextInt();
        System.out.println("value in the array: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("input array is: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("output array is: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println(arr);
    }
}
