import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //inputs
        System.out.print("size of the array: ");
        int n = scn.nextInt();
        System.out.println("value in the array: ");
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.print("enter the key: ");
        int k = scn.nextInt();

        System.out.println("\ninput array is: ");
        display(a);

        rotate(a, k);

        System.out.println("\nrotated array is: ");
        display(a);
    }

    public static void reverse(int[] a, int i, int j){
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            
            i++;
            j--;
        }
    }

    public static void rotate(int[] a , int k){
        k = k % a.length;
        
        if(k < 0){
            k = k + a.length;
        }

        //part 1 reverse
        reverse(a, 0 , a.length - k - 1);

        //part2 reverse
        reverse(a, a.length - k , a.length - 1);

        // whole array reverse
        reverse(a, 0, a.length - 1);
    }
    
    public static void display(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}


/*                  OUTPUT     
            size of the array: 5
            value in the array: 
            1
            2
            3
            4
            5
            enter the key: 4

            input array is:
            1 2 3 4 5
            rotated array is:
            2 3 4 5 1
 */