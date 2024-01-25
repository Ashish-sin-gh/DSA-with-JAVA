import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        int star = 1;
        int space = n/2;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=space; j++){
                if( i == n/2 + 1){
                    System.out.print("*\t"); 
                }
                else{
                    System.out.print("-\t");
                }
            }
        
            for(int j=1; j<=star; j++){
                System.out.print("*\t");   
            }

            if(i<= n/2){
                star++;
            }
            else{
                star--;
            }

            System.out.println();
        }
    }
}
