import java.util.Scanner;

public class FirstAndLastIndexOfData {
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
        int potential1st = 0;

        //1st index
        while(low <= high){
            int mid = (low + high) / 2;

            if(data < arr[mid]){
                high = mid - 1;
            }
            else if(data > arr[mid]){
                low = mid + 1;
            }
            else{
                potential1st = mid;
                high = mid - 1;
            }
        }
        System.out.println(potential1st);

        //last index
        low = 0;
        high = arr.length - 1;
        int potentialLast = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(data < arr[mid]){
                high = mid - 1;
            }
            else if(data > arr[mid]){
                low = mid + 1;
            }
            else{
                potentialLast =  mid;
                low = mid + 1;
            }
        }
        System.out.println(potentialLast);
    }
}
