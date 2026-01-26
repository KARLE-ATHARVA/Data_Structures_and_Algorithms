package RecursionOne;

public class factorial {
    public static void main(String[] args) {

        System.out.println(prod(1342));
        
    }

    static int fact(int n){

        if(n<=1){
            return 1;
        }

        return n*fact(n-1);
    }

    static int sumD(int n){

        if(n==0){
            return 0;
        }

        return (n%10) + sumD(n/10);
    }

    static int prod(int n){

        if(n%10 == n){
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
