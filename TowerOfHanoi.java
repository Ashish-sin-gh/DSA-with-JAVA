import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("enter no of disks: ");
        int n = scn.nextInt();
        System.out.println("enter names of 1st tower: ");
        int t1id = scn.nextInt();
        System.out.println("enter names of 2nd tower: ");
        int t2id = scn.nextInt();
        System.out.println("enter names of 3rd tower: ");
        int t3id = scn.nextInt();

        towerOfHanoi(n , t1id , t2id , t3id);
    }

    public static void towerOfHanoi(int n , int t1id , int t2id , int t3id){
        
        if(n == 0){
            return;
        }

        towerOfHanoi(n - 1 , t1id , t3id , t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        towerOfHanoi(n - 1, t3id, t2id, t1id);
    }
}
