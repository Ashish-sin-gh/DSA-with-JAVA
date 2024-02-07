import java.util.Scanner;

public class FloorCeilArray {
    public static void main(String[] str){
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
        int floor = 0;
        int ceil = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(data < arr[mid]){
                high = mid - 1;
                ceil = arr[mid];
            }
            else if(data > arr[mid]){
                low = mid + 1;
                floor = arr[mid];
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }   
        }

        System.out.println("ceil: " + ceil);
        System.out.println("floor: " + floor);
    }
}
