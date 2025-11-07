package Conditions_and_Loops;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number= in.nextInt();
        System.out.println("Enter the Occurrence Number:");
        int find=in.nextInt();

        int count=0;
        
        while(number>0){
            int n =number % 10;
            if(n==find){
                count++;
            }
            number =number/10;
        }
        System.out.println(count);
    }
}
