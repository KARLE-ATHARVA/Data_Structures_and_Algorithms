package Search;

public class FindEvenNums {
    public static void main(String[] args) {
        int[] nums ={12,345,6789};
        System.out.println("Output:" + digits(-1234));

        System.out.println("Output:" + findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count=0;
        
         for(int num:nums){
            if(evenOrNot(num)){
                count++;
            }
         }

        return count;
    }
    //to check whether num(dig) is even 
    static boolean evenOrNot(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    //to count number of digits
    static int digits(int num){
        
        if(num<0){
            num=num*-1;
        }

        if (num==0){
            return 1;
        }

        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }

        return count;
    }

    static int digits2(int num){

        if(num<0){
            num=num*-1;
        }

        return (int)(Math.log10(num)) +1;
    }
}
