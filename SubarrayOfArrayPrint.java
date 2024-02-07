import java.util.Scanner;

public class SubarrayOfArrayPrint {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //inputs
        System.out.print("size of the array: ");
        int n = scn.nextInt();
        System.out.println("value in the array: ");
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        getSubarray(a);
    }

    public static void getSubarray(int[] a){    
        int i = 0;

        while(i < a.length){
            int j = i;

            while(j < a.length){

                for(int k=i; k<=j; k++){
                    System.out.print(a[k] + " ");
                }

                System.out.println();
                j++;
            }

            i++;
        }
    } 
}