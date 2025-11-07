package Search.BinarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] nums={6,5,4,2,1};
        int target=5;
        int answer=agnoBinarySearch(nums, target);
        System.out.println("The output is :" + answer);
    }

    static int agnoBinarySearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;

        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            //find the middle element 
            // int mid=(start + end)/2 is wrong here to frame.Because, there might be a scenario where, when there is large number the input exceed the rang of Integer.

            int mid= start+ (end-start)/2;

            if (target== arr[mid]){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                }else{
                    start=start+1;
                }
            }else{
                if(target < arr[mid]){
                    start=start+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
