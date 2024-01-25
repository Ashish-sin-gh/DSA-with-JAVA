import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        System.out.println("Enter the key for rotation: ");
        int k = sc.nextInt();
        
        int count = 0;
        int dublicate = n;
        int temp1 = 0;
        int temp2 = 0;

        while(dublicate != 0){
            count++;
            dublicate=dublicate/10;
        }

        k = k % count;

        if (k<0){   
            k = k + count;
        }

        int power = (int)Math.pow(10, k);
        temp1 = n % power;
        temp2 = n / power;
        int temp3 = temp2;
        int count2=0;

        while(temp2 != 0){
            count2++;
            temp2 = temp2/10;
        }
        
        n = temp1 * (int)Math.pow(10,count2) + temp3;
        System.out.println(n);

    }
}
