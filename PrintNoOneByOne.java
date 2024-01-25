import java.util.Scanner;

public class PrintNoOneByOne {
    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        
        while(temp != 0){   //digit calulate hoga isse 
            count++;
            temp = temp/10; 
        }

        for(int i=count; i>0; i--){ 
            int div = (int)(Math.pow(10 , i-1));
            int temp2 = n/div;
            System.out.println(temp2);
            n = n%div;
        }
    }
}
