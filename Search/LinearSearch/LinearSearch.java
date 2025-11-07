package Search;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums={23,43,4,-5,2};
        int target=5;
        int answer = linearSearch(nums, target);
        System.out.println("The Answer is:"+ answer);

    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
