package Functions;

import java.util.Scanner;

public class isArmstrong{
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrongorNot(n));
    }

    static boolean isArmstrongorNot(int num){
        int original=num;
        int sum=0;

        while(num>0){
            int rem= num%10;
            num=num/10;

            sum= sum + rem*rem*rem;
        }

        return sum==original;
    }


}