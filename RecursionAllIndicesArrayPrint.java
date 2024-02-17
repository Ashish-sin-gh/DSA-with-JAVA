import java.util.Scanner;

public class RecursionAllIndicesArrayPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = scn.nextInt();
        System.out.println("enter the value for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("enter the data: ");
        int data = scn.nextInt();

        int[] ai = allIndices(arr , 0 , data , 0);
        
        System.out.println("output is:");
        // ai array is empty | no data in the array
        if(ai.length == 0){
            System.out.println("data isnt present anywhere in the array!");
            return;
        }
        
        for(int i =0; i < ai.length; i++){
            System.out.println(ai[i]);
        }
    }

    public static int[] allIndices(int[] arr , int index , int data , int countFoundData){
        if(index == arr.length){
            return new int[countFoundData];
        }

        if(arr[index] == data){
          int[] iarr = allIndices(arr, index + 1, data, countFoundData + 1);
          iarr[countFoundData] = index;
          return iarr;
        }
        else{
          int[] iarr = allIndices(arr, index + 1, data, countFoundData);
            return iarr;
        }
    }
}
