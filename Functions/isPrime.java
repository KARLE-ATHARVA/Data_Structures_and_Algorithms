package Functions;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrimeorNot(n));
    }

    static boolean isPrimeorNot(int n){
        
        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c <= n){
            if(n%2==0){
                return false;
            }
            c++;
        }
        return c*c>n ;
    }
}
