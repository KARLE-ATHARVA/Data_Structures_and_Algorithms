package Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,5},
            {32,43,54,12},
            {32,4,3,5,2,1}
        };
        int target=54;
        int[] ans =got(arr,target);
        System.out.println(Arrays.toString(ans));    
    }

    static int[] got(int[][] arr,int target){

        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};

        
    }

    
}
