import java.util.Scanner;

public class DifferenceOfTwoArrays{
    public static void main(String[] args) throws Exception{
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
        System.out.println("(bigger than first array)");
        System.out.println("enter the value in the 2nd array: ");
        int[] arr2 = new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();       
        }

        // 3rd array to store result of the substraction 
        int[] arrS = new int[n2]; // n2 will be greater than n1 acc to quesiton 

        // substraction of two array
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arrS.length - 1;
        
        int carry = 0;
        
        while(k >= 0){
            int ans = 0;
            // after reaching zero of smaller array assign all other value less than 0 as 0  
            int arrr1val = i >= 0 ? arr1[i] : 0;  

            if(arr2[j] + carry >= arrr1val){
                ans = arr2[j] + carry - arrr1val;
                carry = 0;
            }
            else{
                ans = (arr2[j] + carry + 10) - arrr1val;
                carry = -1;
            }

            arrS[k] = ans;

            i--;
            j--;
            k--;
        }

        // ignore printing preceeding zeros in the output
        int index = 0;
        
        while(index < arrS.length){

            if(arrS[i] == 0){
                index++;
            }
            else{
                break;
            }
        }
        System.out.println("answer is: ");
        while(index < arrS.length){
            System.out.println(arrS[index]);
            index++;
        }
    }    
}
