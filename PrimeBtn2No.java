import java.util.Scanner;

public class PrimeBtn2No {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter the no from-to ypu want prime of: ");
        int low = scn.nextInt();
        int high = scn.nextInt();


        while(low<=high){
            int count = 0;
            for(int div=2; div*div<=low; div++){
                if(low%div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0)  
                System.out.print(low + "  ");
            low++;
        }
    }
    
}
