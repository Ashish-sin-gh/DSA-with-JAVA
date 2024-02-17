import java.util.ArrayList;
import java.util.Scanner;

public class RcursionGetStairPath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scn.nextInt();

        ArrayList<String> result = getStairPath(n);
        System.out.println("output is: "+result);
    }

    public static ArrayList<String> getStairPath(int n){
        //base case for n == 0 
        if(n == 0){
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }
        //base case for -ve n
        if(n < 0){
            ArrayList<String> baseRes = new ArrayList<>();
            return baseRes;
        }

        ArrayList<String> p0tnm1 = getStairPath(n - 1);
        ArrayList<String> p0tnm2 = getStairPath(n - 2);
        ArrayList<String> p0tnm3 = getStairPath(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for(String path : p0tnm1){
            paths.add(1 + path);
        }

        for(String path : p0tnm2){
            paths.add(2 + path);
        }

        for(String path : p0tnm3){
            paths.add(3 + path);
        }

        return paths;
    }
}
