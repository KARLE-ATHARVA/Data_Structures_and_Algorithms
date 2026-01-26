package RecursionOne;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(18389);
        int answer=rev2(1234);
        System.out.println(pallindrome(4334,rev2(4334)));

        
        
    }
    static int sum=0;
     static void reverse(int n){

            if(n==0){
                return;
            }
            int rem = n%10;
            sum= sum*10 + rem;
            reverse(n/10);
     }

     static int rev2(int n){
        //sometimes you might need some additional variables in the argument.
        //in that case, make another function.
        
        int digit=(int)(Math.log10(n) + 1);

        return helper(n,digit);
     }

     private static int helper(int n, int digit){
        if(n%10 == n){
            return n;
        }

        int rem = n% 10;
        return rem * (int)(Math.pow(10,digit - 1)) + helper(n/10,digit-1);
     }

     static boolean pallindrome(int a, int b){

        if(a==b){
            return true;
        }

        return false;
     }

     


}
