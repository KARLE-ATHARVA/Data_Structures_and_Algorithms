package RecursionArrays;
import java.util.ArrayList;

public class FindSorted{
    public static void main(String[] args){

        int[] arr={1,2,3,0,4,5,0};

        int target=0;
 
        int answerLocation=whereLocation(arr,target,0);
        boolean answerFind=isElement(arr,target,0);
        boolean answer=isSorted(arr);
        ArrayList<Integer> answer2 = findAllIndex2(arr,target,0);
        System.out.println(answer2);

    }

    //find if the array is sorted.
    static boolean isSorted(int[] arr){


        return helper(arr,0);

    }

    static boolean helper(int[] arr, int index){

        if(index == arr.length-1){
            return true;
        }
        
        return arr[index] < arr[index+1] && helper(arr,index+1);
    }

    //Find existence
    static boolean isElement(int[] arr, int target, int index){

        if(index == arr.length-1){
            return arr[index] == target;
        }

        return arr[index] == target || isElement(arr,target,index+1);
    }
    
    //Finding Location
    static int whereLocation(int[] arr, int target,int index){

        if(index == arr.length){
            return -1;
        }

        if(arr[index]== target){
            return index;
        }else{
            return whereLocation(arr,target,index+1);
        }
    }

    //Finding Multiple Ocurrences

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){

        if(index==arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr,target,index+1);
    }

    //Returning ArrayList without taking it into argument

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list= new ArrayList<>();

        if(index==arr.length){
            return list;
        }

        //this will contain ans for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);

        return list;

    }

}