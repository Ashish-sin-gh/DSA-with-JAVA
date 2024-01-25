import java.util.Scanner;

public class AnybaseToAnybase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        System.out.print("enter number System form: ");
        int nosys1 = sc.nextInt();
        System.out.print("enter number System form for output: ");
        int nosys2 = sc.nextInt();

        int answer = converter(n, nosys1, nosys2);
        System.out.println(+answer);
    }

    public static int converter(int n , int nosys1, int nosys2){
        int ans = 0;
        int i=0;

        while(n!=0){
            int newn = n%nosys2;
            ans = ans + newn * (int)Math.pow(nosys1, i);
            i++;
            n=n/nosys2;
        }
        return ans;
    }
}
