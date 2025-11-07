package Conditions_and_Loops;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max=Math.max(c,Math.max(a, b));

        System.out.println("The Largest Number is: " + max);
    }
}
