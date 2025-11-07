package Conditions_and_Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Number for Fibonacci Series: ");
        int num=in.nextInt();
        int count=2;
        int a=0;
        int b=1;
        while(count<=num){
            int temp= b;
            b +=a;
            a=temp;
            count++;
        }

        System.out.println(b);
    }
}
