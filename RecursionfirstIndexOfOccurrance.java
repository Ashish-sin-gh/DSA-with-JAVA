import java.util.Scanner;

public class RecursionfirstIndexOfOccurrance {
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

        int fi = firstIndex(arr , 0 , data);
        System.out.println("1st index for the entered data is: ");
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr , int index , int data){

        int fiisa = firstIndex(arr, index + 1, data);

        if(arr[index] == data){
            return index;
        }
        else{
            return fiisa;
        }
    }
}
