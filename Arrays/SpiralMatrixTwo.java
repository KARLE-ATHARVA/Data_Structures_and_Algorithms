package Arrays;

import java.util.Arrays;

public class SpiralMatrixTwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if (n == 0) return result;

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int index = 1;

        while (top <= bottom && left <= right && index <= n * n) {

            for (int i = left; i <= right && index <= n * n; i++)
                result[top][i] = index++;
            top++;

            for (int j = top; j <= bottom && index <= n * n; j++)
                result[j][right] = index++;
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left && index <= n * n; k--)
                    result[bottom][k] = index++;
                bottom--;
            }

            if (left <= right) {
                for (int l = bottom; l >= top && index <= n * n; l--)
                    result[l][left] = index++;
                left++;
            }
        }

        return result;
    }
}
