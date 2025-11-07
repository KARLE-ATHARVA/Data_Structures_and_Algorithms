package Search;

import java.util.ArrayList;
import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] output=runningSum(nums);
        System.out.println("Output: " + Arrays.toString(output));
    }

    static int[] runningSum(int[] nums) {
        ArrayList<Integer> output = new ArrayList<>();

        int sum=0;

        for(int num: nums){

            sum+= num;
            output.add(sum);
        }

        // ✅ Convert ArrayList to int[]
        int[] result = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }
        
        return result;
    }
}
