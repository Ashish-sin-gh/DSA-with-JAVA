import java.util.Scanner;

public class AnyBaseSubstraction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number1: ");
        int n1 = sc.nextInt();

        System.out.print("enter number2: ");
        int n2 = sc.nextInt();

        System.out.print("enter number System form: ");
        int base = sc.nextInt();

        int answer = sub(n1, n2, base);
        System.out.println("the addtion of " + n1 + " and " + n2 +" in base " + base + " is: " + answer);
        
    }


    public static int sub(int n1, int n2, int base){
        int ans = 0;
        int i = 0;

        while(n1!=0 || n2!=0){

            int onesPlace1 = n1%10;
            int onesPlace2 = n2%10;
            int substract = 0;

            if(onesPlace1 >= onesPlace2){
                substract = onesPlace1 - onesPlace2;
                n1 /= 10;  
            }
            else{
                onesPlace1 += base; 
                n1 = (n1/10) - 1;
                substract = onesPlace1 - onesPlace2;
            } 
            
            ans = ans + substract * (int)Math.pow(10, i);

            n2 /= 10;
            i++;
        }

        return ans;
    }
}
    