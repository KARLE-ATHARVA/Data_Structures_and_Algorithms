package Arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {
        int[] answer= new int[nums.length];
        int product=1;
        int product2=1;
        //to make prefix product array
        for(int i=0;i<nums.length;i++){
            if(i==0){
                answer[i]=nums[i];
            }else{
                for(int j=i-1;j>=0;j--){
                    product=product*nums[j];
                }
                answer[i]=product;

            }
        }

        //to make suffix array
        for(int k=nums.length-1;k>=0;k--){
            if(k==nums.length-1){
                answer[k]=answer[k]*1;
            }else{
                for(int m=k+1;m<nums.length;m++){
                    product2=product2*nums[m];
                }
                answer[k]=answer[k]*product2;
            }
        }
        return answer;
    }
}
