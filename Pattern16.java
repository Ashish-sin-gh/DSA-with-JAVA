import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        
        int digit=1;
        int space=2*n -3;

        for(int i=1; i<=n; i++){
            int val = 1;

            for(int j=1; j<=digit; j++){
                System.out.print(val + "\t");
                val++;
            }
            
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            
            if(i==n){
                digit--;
                val--;
            }

            for(int j=1; j<=digit; j++){
                val--;
                System.out.print(val + "\t");
            }
            
            digit++;
            space -= 2;
            

            System.out.println();
        }
    }   
}
