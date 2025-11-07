package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {-2,-1,0,2,1};
        max(arr);

    }   
    static void max(int[] nums){
        int max=0;
        for( int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max= nums[i];
            }
        }
        System.out.println("The Maximum Number is: "  + max);
    } 
}
