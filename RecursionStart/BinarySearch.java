package RecursionStart;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={ 2,1,3,5,4};
        int target=51;
        int answer=search(arr, target, 0, arr.length-1);

        System.out.println(answer);

    }

    static int search(int[] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }

        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr, target, s, mid-1);
        }

        return search(arr, target, mid+1, e);
    }
}
