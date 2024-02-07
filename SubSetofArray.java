// to make sub-set of a set u need to find the binary of the (0 to 2^n-1);
// if array of n length | subset = 2^n

import java.util.Scanner;

public class SubSetofArray {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values into the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        // code for finding the binary
        int bi = (int)Math.pow(2, arr.length);

        for(int i = 0; i < bi; i++){
            String str = "";
            int temp = i;

            for(int j = arr.length - 1; j >= 0; j--){
                int r = temp % 2;
                
                if(r == 1){
                    str = arr[j] + "\t"  + str;
                }
                else{
                    str = "-\t" + str;
                }

                temp = temp / 2;
            }
            System.out.println(str);
        }
    }
}
