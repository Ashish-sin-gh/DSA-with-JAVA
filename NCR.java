import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.print("enter r: ");
        int r = sc.nextInt();

        int nfact=1;
        for(int i=1; i<=n; i++){
            nfact *= i;
        }

        int nmrfact=1;
        for(int i=1; i<=n-r; i++){
            nmrfact *= i;
        }

        int rfact=1;
        for(int i=1; i<=r; i++){
            rfact *= i;
        }

        int res = nfact/(nmrfact*rfact);
        System.out.println("combinnation is: " + res);
    }
}
