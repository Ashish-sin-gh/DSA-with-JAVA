import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                
                if(i == 1){
                    if(j<=n/2+1 || j == n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else if( i>1 && i<=n/2){
                    if(j==n/2+1 || j==n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else if( i == n/2 + 1){
                    System.out.print("*\t");
                }
                
                else if(i>n/2+1 && i<n){
                    if(j==1 || j == n/2+1){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else{
                     if(j == 1 || j>=n/2+1){
                        System.out.print("*\t");
                     }
                     else{
                        System.out.print("\t");
                     }
                }
            }

            System.out.println();
        }
    }   
}
