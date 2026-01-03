package Array;

import java.util.Arrays;

public class PassinginFuctions {
   public static void main(String[] args) {
        int[] nums = {5,8,9,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
       System.out.println(Arrays.toString(nums));
    }
     static void change(int[] arr){
       arr[0]= 7;
     }
}
