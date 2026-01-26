package RecursionOne;

public class PassingOne {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        // fun(n--);  This will go in infinite recursion loop, because n-- will pass current value of n first and then subtract it.And in this in recursion always fun(5) is coming.

        fun(--n);   //This will subtract first and then pass the new value of n.
    }
}
