import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        //fibonacii code + pattern code
        int a = 0;
        int b = 1;  
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int c = a+b;
                System.out.print(a + "\t");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
