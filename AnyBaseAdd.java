import java.util.Scanner;

public class AnyBaseAdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number1: ");
        int n1 = sc.nextInt();

        System.out.print("enter number2: ");
        int n2 = sc.nextInt();

        System.out.print("enter number System form: ");
        int base = sc.nextInt();

        int answer = add(n1, n2, base);
        System.out.println("the addtion of " + n1 + " and " + n2 +" in base " + base + " is: " + answer);
        
    }


    public static int add(int n1, int n2, int base){
        int ans=0;
        int divIsCarry=0;
        int i=0;

        while(n1!=0 || n2!=0 || divIsCarry !=0){

            int onesPlace1 = n1%10;
            int onesPlace2 = n2%10;

            int sum = onesPlace1+onesPlace2+divIsCarry;

            divIsCarry = sum/base; 
            int rem = sum%base;  //yehi answer dega in the end

            ans = ans +  rem * (int)Math.pow(10, i);

            n1 = n1/10;
            n2 = n2/10;
            i++;
        }
        
        return ans;
    }
}
