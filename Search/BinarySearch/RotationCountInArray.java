package Search.BinarySearch;

public class RotationCountInArray {
        public static void main(String[] args) {
            int[] nums={4,5,6,7,0,1,2};
            int answer=rotationCount(nums);
            System.out.println("The Rotation Count is :" + answer);
        }

        static int rotationCount(int[] arr){

            int peak=peakSearch(arr);
            int answer = peak + 1;

            return answer;

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
