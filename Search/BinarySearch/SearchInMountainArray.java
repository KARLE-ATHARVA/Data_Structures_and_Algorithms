package Search.BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] nums={-11,-2,1,2,3,4,5,6};
        int target=5;
        int answer=binarySearch(nums, target);
        System.out.println("The output is :" + answer);
    }
 

}
