package Search.BinarySearch;

public class FindInfinite {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target=5;
        int answer=ans(nums, target);
        System.out.println("The output is :" + answer);
    }

    static int ans(int[] arr, int target){

        //first find the range
        //first start with a box of size 2

        int start=0;
        int end=1;
        //condition for the target to lie in the range
        if(target > arr[end]){
            int newStart=end+1;
            int newEnd= end + (end-start + 1)*2;

            start=newStart;
            end=newEnd;
        }

        return binarySearch(arr, target, start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            //find the middle element 
            // int mid=(start + end)/2 is wrong here to frame.Because, there might be a scenario where, when there is large number the input exceed the rang of Integer.

            int mid= start+ (end-start)/2;

            if(target < arr[mid]){
                end=mid-1;
            }else if(target> arr[mid]){
                start=start+1;
            }
            else{
                return mid;
            }  
        }
        return -1;
    }
}
