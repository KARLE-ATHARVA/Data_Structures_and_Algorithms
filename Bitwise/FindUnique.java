package Bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,2,2,3};

        System.out.println(unique2(arr));
    }

    static int unique(int[] arr){

        int unique=0;

        for(int n:arr){
            unique ^= n;
        }

        return unique;

    }
    //T(n)=O(N)
    //Space=O(1)
    static int unique2(int[] arr){

        int result = 0;

        // Iterate through all 32 bit positions
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            // Count set bits at current position
            for (int num : arr) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            // If count % 3 != 0, set this bit in result
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }
        return result;
    }
}
