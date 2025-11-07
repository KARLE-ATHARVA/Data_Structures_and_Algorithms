package Search;


public class FindMin {
    public static void main(String[] args) {
        int[] arr={22,43,54,1,2,-1};
        int answer=gotMin(arr);
        System.out.println("The Minimum Value is:" + answer);
        int answer2=gotMax(arr);
        System.out.println("The Maximum Value is:" + answer2);


    }   

    static int gotMin(int[] arr){
        int min=arr[0];

        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return -1;
    }

    static int gotMax(int[] arr){
        int max=arr[0];

        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
