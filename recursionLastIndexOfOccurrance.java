import java.util.Scanner;

public class recursionLastIndexOfOccurrance {
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

        int li = lastIndex(arr , 0 , data);
        System.out.println("last index for the entered data is: ");
        System.out.println(li);
    }

    public static int lastIndex(int[] arr , int index , int data){
        if(index == arr.length){
            return -1;
        }

        int liisa = lastIndex(arr , index + 1 , data);

        if(liisa == -1){    // if didnt found the data in [lastindex(arr, index+1 (imagine 1), data)]  [1 -> end of array]
            if(arr[index] == data){  // [0 -> end] funciton is checked | found the data at this index
                return index;
            }
            else{
                return -1;
            }
        }
        else{
            return liisa;
        }
    }
}
