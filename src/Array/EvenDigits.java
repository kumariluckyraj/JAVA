package Array;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={1,34,5,7444,6};
        //System.out.println(findNumbers(nums));
        System.out.println(digits(0));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }

        }
        return count;
    }
    static boolean even(int num){
        int numofDigits = digits(num);
        return numofDigits %2 ==0;
    }
    static int digits(int num){
        if(num<0){
            num = num*-1; // if number ins -ve then make it +ve
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
