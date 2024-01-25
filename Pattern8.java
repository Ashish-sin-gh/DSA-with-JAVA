import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                if(j==i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    
}
