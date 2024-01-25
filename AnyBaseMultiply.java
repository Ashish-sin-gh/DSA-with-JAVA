import java.util.Scanner;

public class AnyBaseMultiply {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number1: ");
        int n1 = sc.nextInt();

        System.out.print("enter number2: ");
        int n2 = sc.nextInt();

        System.out.print("enter number System form: ");
        int base = sc.nextInt();

        int answer = getmulti(n1, n2, base);
        System.out.println("the multiplication of " + n1 + " and " + n2 +" in base " 
        + base + " is: " + answer);
    }

    public static int add(int n1, int n2, int base){
        int ans = 0;
        int carry = 0;
        int i = 0;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1 = n1%10;
            int d2 = n2%10;

            int added = d1+d2+carry;
            carry = added/base;
            added = added%base;
            
            ans = ans + added * (int)Math.pow(10,i);

            i++;
            n1 /= 10;
            n2 /= 10;
        }
        return ans;
    }

    public static int singleDigitProduct(int n1, int d2, int base){
        int ans = 0;
        int carry = 0;
        int i = 0;

        while(n1 != 0 || carry != 0){
            int d1 = n1%10;
            n1 = n1/10;

            int product = d1 * d2 + carry;

            carry = product/base;
            product = product%base;

            ans = ans + product * (int)Math.pow(10, i);
            i++;
        }

        return ans;
    }

    public static int getmulti(int n1,  int n2, int base) {
        int lastAns = 0;
        int i = 0;

        while(n2 != 0){
            int d2 = n2%10;
            n2 = n2/10;

            int prod = singleDigitProduct(n1, d2, base);
            lastAns = add(lastAns, (prod * (int)Math.pow(10,i)) , base);
            i++;
        }
        return lastAns;
    }
}
    