import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number: " );
        int n = scn.nextInt();

        for(int i=2; i<=n; i++){
            while(n%i == 0){
                System.out.println(i);
                n = n / i;
            }
        }
        // if(n != 1){
        //     System.out.println(n);
        // }
    }   
}
