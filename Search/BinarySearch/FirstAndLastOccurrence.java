package Search.BinarySearch;
import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,10};
        int target=9;
        int[] answer=occurrenceSearch(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    static int[] occurrenceSearch(int[] arr, int target){
        int[] answer={-1,-1};

        //check for first occurrence if target first
        answer[0] = search(arr,target,true);
        if(answer[0] != -1){
            answer[1]=search(arr,target,false);
        }


        return answer;
    }

    //this function return index vlaue of target
    static int search(int[] arr, int target,boolean findStartIndex){
        
        int start=0;
        int end=arr.length-1;
        int ans= -1;

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
                ans=mid;

                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }  
        }
        return ans;

    }
}
