package Search.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums={-2,0,2,4,5};
        int target=1;
        int answer=ceiling(nums, target);
        System.out.println("The output is :" + answer);
    }   

    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        if(target<arr[start] || target>arr[end]){
            return -1;
        }

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
                return arr[mid];
            }  
        }
        return arr[start];
    }
}
