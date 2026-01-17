package Maths;

public class GCDandLCM {
    public static void main(String[] args){

        int answer = gcd(3,6);

        int answer2 =lcm(3,6);

        System.out.println(answer2);

    }

    static int gcd(int a, int b){

        if(a==0){
            return b;
        }

        return gcd( b % a, a );
    }

    static int lcm(int a, int b){

        return a*b/gcd(a,b);
    }
}
