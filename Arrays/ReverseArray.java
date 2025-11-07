package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6};

        reverse(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length - 1;

        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
    }


}
