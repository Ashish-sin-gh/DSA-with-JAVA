import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star=n;
        int space=0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }
            System.out.println();
            star--;
            space++;
        }

    }
    
}
