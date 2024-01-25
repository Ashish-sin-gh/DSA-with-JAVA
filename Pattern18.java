/*    
       * * * * * * * 
         *       *
           *   *
             *
           * * *
         * * * * *
       * * * * * * *             
 */

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        int ospace = 0;
        int ispace = n-2;
        int star = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=ospace; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }

            for(int j=1; j<=ispace; j++){
                if(i == 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            for(int j=1; j<=star; j++){
                if(i<=n/2 ){
                    System.out.print("*\t");
                }
            }
            
            if(i<=n/2){
                ospace++;
                ispace -= 2;
            }
            else{
                ospace--;
                ispace = 0;
                star += 2;
            }

            System.out.println();
        }
    }
}

