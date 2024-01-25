import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        
        int space = n/2;
        int digit = 1;
        int val=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }

            int cval = val;

            for(int j=1; j<=digit; j++){
                System.out.print(cval + "\t");

                if(j<=digit/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }

            if(i<=n/2){
                space--;
                digit += 2;
                val++;
            }
            else{
                space++;
                digit -= 2;
                val--;
            }
            System.out.println();
        }
    }
}

