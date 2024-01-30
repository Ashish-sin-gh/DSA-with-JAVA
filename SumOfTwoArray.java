import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // input 1st array and its elements
        System.out.print("enter the size of 1st array: ");
        int n1 = scn.nextInt();
        System.out.println("enter the value in the 1st array: ");
        int[] arr1 = new int[n1];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        } 
        // intput second array and its elements
        System.out.print("enter the size of 2nd array: ");
        int n2 = scn.nextInt();
        System.out.println("enter the value in the 2nd array: ");
        int[] arr2 = new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        } 
        
        // 3rd array to store the final output    
        // int[] arr = new int[n1>=n2 ? n1:n2]    --> terinery operator   (or)
        int[] arr;
        if(n1 >= n2){
            arr = new int[n1];
        }
        else{
            arr = new int[n2];
        }

        // adding both the array and dumping it on the 3rd array
        int carry = 0;
        //pointers
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr.length - 1;

        while(k >= 0){
            int ans = carry;

            if( i >= 0){
                ans = ans + arr1[i];
            }

            if(j >= 0){
                ans = ans + arr2[j];
            }

            carry = ans / 10;
            ans = ans % 10;

            arr[k] = ans;

            i--;
            j--;
            k--;
        }
        
        System.out.print("output is: ");
        if(carry != 0){
            System.out.print(carry);
        }
        for(int singledigit : arr){ 
            System.out.print(singledigit);
        }
    }
}

