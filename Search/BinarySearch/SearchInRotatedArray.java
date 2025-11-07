package Search.BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums={2,9,2,2,2};
        int target = 9;
        int pivot = findPivot(nums);
        int answer = search(nums, target);
        System.out.println(pivot);
        System.out.println(answer);
    }

    static int search (int[] nums, int target){

        int pivot = findPivot(nums);
        // if you did not found pivot , then array is not rotated, so do standard Binary Search

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length -1);
        }

        // if pivot is found, we have two asc arrays

        if(nums[pivot] == target ){
            return pivot;
        }else if ( target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }else{
            return binarySearch(nums, target, pivot+1, nums.length - 1);
        }
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid element > next element → mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid element < previous element → mid-1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: left side is unsorted → pivot is on the left
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {  // Case 4: pivot is on the right
                start = mid + 1;
            }

            //if elements at the middle,start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid]== arr[end]){

                //skip the duplicates 
                //NOTE: what if start or end is the pivot so check it first

                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]< arr[end-1]){
                    return end -1;
                }
                end--;
            }

            // left side is sorted, so pivot should be in right

            else if(arr[start]< arr[mid] || (arr[start]== arr[mid] && arr[mid]> arr[end])){
                start= mid+1;
            } else {
                end=mid-1;
            }
        }

        return -1;
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
