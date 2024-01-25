import java.util.Scanner;

public class PythogoreanTri {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("enter 1st number: ");
        int a = scn.nextInt();
        System.out.print("enter 2st number: ");
        int b = scn.nextInt();
        System.out.print("enter 3rd number: ");
        int c = scn.nextInt();
        System.out.println();

        int max = a;
        if(b>=max)
            max=b;
        if(c>=max)
            max=c;

        if(max == a){
            boolean output = (b*b + c*c == a*a);
            System.out.println(output);
        }
        else if(max == b){
            boolean output = (a*a + c*c == b*b);
            System.out.println(output);
        }
        else{
            boolean output = (b*b + a*a == c*c);
            System.out.println(output);
        }
    }
}
