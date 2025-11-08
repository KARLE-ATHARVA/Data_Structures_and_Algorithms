package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={-1,2,-34,-45};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] arr){

        boolean swaped;
        //run the steps (n-1) times
        for(int i=0;i<arr.length;i++){
            swaped=false;
            //for each step, max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item.
                if(arr[j-1]> arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swaped=true;
                }
            }
            //if you did not swap for a paricular value of i it means the array is already sorted.
            if(swaped==false){
                break;
            }
        }
    }
}
