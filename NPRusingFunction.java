import java.util.Scanner;

public class NPRusingFunction {
    public static void Display(int npr){
        System.out.println(npr);
    }

    public static int fact(int x){
        int res=1;
        for(int i=1;i<=x;i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.print("enter r: ");
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact= fact(n-r);

        int result = nfact/ nmrfact;
        Display(result);
    }
}
