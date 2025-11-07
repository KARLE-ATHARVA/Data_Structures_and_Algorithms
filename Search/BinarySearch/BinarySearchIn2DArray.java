package Search.BinarySearch;
import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };
        int target = 10; 

        int[] answer=search(arr, target);

        System.out.println("The Answer is:" + Arrays.toString(answer));        
    }

    static int[] search(int[][] matrix, int target){

        int r=0;
        int c=matrix.length -1;

        while(r<matrix.length && c>=0){

            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
