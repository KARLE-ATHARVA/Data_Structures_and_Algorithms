package Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        int count=sortColors(nums);
        System.out.println(count);
        //sortColors(nums);
        //System.out.println(Arrays.toString(nums));
    }
    static int sortColors(int[] nums) {
        int r=0;
        int w=0;
        int b=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                r++;
            }else if(nums[i]==1){
                w++;
            }else{
                b++;
            }
        }
        return r+w+b;
    }

}
