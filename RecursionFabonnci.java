import java.util.Scanner;

public class RecursionFabonnci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = scn.nextInt();

        int fab = getFab(n);
        System.out.println(fab);
    }

    public static int getFab(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fabnm1 = getFab(n - 1);
        int fabnm2 = getFab(n - 2);
        int fabn = fabnm1 + fabnm2;
        return fabn;
    }
}
