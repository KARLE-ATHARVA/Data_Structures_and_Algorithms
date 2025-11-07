package Search.BinarySearch;

public class SmallestLetter {
        public static void main(String[] args) {
        char[] nums={'a','b','d'};
        char target='c';
        char answer=nextGreatestLetter(nums, target);
        System.out.println("The output is :" + answer);
    }   

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){

            int mid= start+ (end-start)/2;

            if(target < letters[mid]){
                end=mid-1;
            }else{
                start=start+1;
            }
        }
        return letters[start % letters.length];
    }
}
