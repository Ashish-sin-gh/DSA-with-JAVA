import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }
                    else if( i>n/2 && ( i==j || i+j == n+1)){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                } 
                System.out.println();
            }
        }
    }
