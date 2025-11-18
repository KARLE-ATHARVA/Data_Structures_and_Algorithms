package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDuplicated {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        int i=0;
        while(i<n){
            int correct=nums[i]-1;

            if(nums[i] <= n && nums[i] != nums[correct] ){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        //Make the required array
        for(int j=0;j<n;j++){
            if(j != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    static  void cyclicSort(int[] arr){
        int i =0;
        while( i<arr.length){
            int correct=arr[i]-1;
            
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct); 
            }else{
                 i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
