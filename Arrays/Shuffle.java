package Arrays;

import java.util.Arrays;

public class Shuffle {

    public static void main(String[] args) {
    int[] arr={1,2,3,4,4,3,2,1};
    int n=4;
    System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static int[] shuffle(int[] nums, int n){

        int s1=0;
        int s2=n;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            if(i%2==0){
                ans[i]=nums[s1];
                s1++;
            }else{
                ans[i]=nums[s2];
                s2++;
            }
        }
        return ans;
    }
}
