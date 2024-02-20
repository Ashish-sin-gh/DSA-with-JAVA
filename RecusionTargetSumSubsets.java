import java.util.Scanner;

public class RecusionTargetSumSubsets {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter the size of array: ");
        int n = scn.nextInt();

        System.out.println("enter the value in the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("enter the target: ");
        int target = scn.nextInt();

        printTSS(arr, 0, "", 0, target);
    }

    public static void printTSS(int[] arr, int index, String output, int sum, int target){
        //base case
        if(index == arr.length){
            if(sum == target){
                System.out.println(output + ".");
            }
            return;
        }
            
        //number part of the subset
        printTSS(arr, index + 1, output + arr[index] + ",", sum + arr[index], target);
        //number not part of the subset
        printTSS(arr, index + 1, output + "", sum + 0, target);
    }
}
