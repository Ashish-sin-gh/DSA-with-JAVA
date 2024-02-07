import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values into the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int bi = (int) Math.pow(2 , arr.length);
        for(int i = 0; i < bi; i++){
            int temp = i;
            String str = "";
            for(int j = arr.length-1; j >= 0; j--){
                int r = temp % 2;

                if(r == 0){
                    str = "-\t" + str;
                }else{
                    str = arr[j] + "\t" + str;
                }

                temp = temp / 2;
            }
            System.out.println(str);
        }
    }
}
