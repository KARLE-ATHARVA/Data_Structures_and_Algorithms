package Search.BinarySearch;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] nums={0,2,4,6,3,1};
        int answer=peakSearch(nums);
        System.out.println("The output is :" + answer);
    }
 
    static int peakSearch(int[] arr){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find the middle element 
            // int mid=(start + end)/2 is wrong here to frame.Because, there might be a scenario where, when there is large number the input exceed the rang of Integer.

            int mid= start+ (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }else {
                start=start+1;
            }
        }
        return start;
    }
}
