package Conditions_and_Loops;

public class Reversing {
    public static void main(String[] args) {
        int num=23597;
        int result=0;
        while(num>0){
            int rem=num%10;

            result=result*10 + rem;

            num=num/10;


        }
        System.out.println(result);
    }
}
