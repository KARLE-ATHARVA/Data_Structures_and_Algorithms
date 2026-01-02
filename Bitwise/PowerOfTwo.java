package Bitwise;

public class PowerOfTwo {
    
    public static void main(String[] args){
        int n=15;
        System.out.println(power(n));

    }

    static boolean power(int n){

        if ((n & (n-1)) == 0) return true;

        return false;
    }
}
