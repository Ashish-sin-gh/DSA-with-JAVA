import java.util.Scanner;

public class AnybaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        System.out.print("enter number System form: ");
        int nosys = sc.nextInt();

        int answer = converter(n, nosys);
        System.out.println("equivelent base 10 value is: "+answer);
    }

    public static int converter(int n , int nosys){
        int ans = 0;
        int i=0;

        while(n!=0){
            int newn = n%10;
            ans = ans + newn * (int)Math.pow(nosys, i);
            i++;
            n=n/10;
        }
        return ans;
    }
}
