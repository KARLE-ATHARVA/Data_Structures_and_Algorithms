package Maths;

public class isPrime {
    public static void main(String[] args) {

        int n=40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
        

    }
 
  //false in array number is prime
    static void sieve(int n,boolean[] primes){

        for(int i=2;i*i<=n;i++){

            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                } 
            }

        } 

        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int n){

        if(n<=1){
            return false;
        }

        int c=2;

        while(c*c <= n){

            if(n % c ==0){
                return false;
            }
        }

        return true;
    }
}
