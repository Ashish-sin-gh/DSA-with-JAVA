import java.util.Scanner;

public class ConvertDecimalToAnotherNoSystem {

    public static int converter(int n, int nosys){
        int sum=0;
        int i=0;

        while(n!=0){
            int newn=n%nosys;
            sum = sum+ (newn * (int) Math.pow(10, i));
            i++;
            n = n/nosys;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number in decimal no system: ");
        int n = sc.nextInt();
        System.out.print("enter Number system in which u want to convert: ");
        int nosys = sc.nextInt();
       
        int converted = converter(n, nosys);
        System.out.println(converted);
    }
}
