package Maths;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        int n = 20;

        int[] answer = factor(n);

        System.out.println(Arrays.toString(answer));
    }

    static int[] factor(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                list.add(i);

                // Avoid duplicate when i == n/i
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
