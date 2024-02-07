import java.util.Scanner;

public class InverseAnArray {
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

        int[] arr = inverse(a);
        
        display(arr);
    }

    public static void display(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static int[] inverse(int[] a){
        int i = 0;

        int[] arr = new int[a.length];

        while(i < a.length){
            int temp = a[i];
            arr[temp] = i;
            
            i++;
        }
        return arr;
    }
}