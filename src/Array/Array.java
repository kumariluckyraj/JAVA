package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // datatype[] variable_name = new datatype[size]
        // datatype in the array should be same
        // reference variable -> stack
        // new int[size] -> heap, runtime


        //array of premetives
        Scanner in = new Scanner(System.in);
       // int[] arr = new int[5]; here e know that we need an array of size 5 but what if we don't know the array length so we use arraylist

       // for (int i = 0; i < arr.length; i++) {
         //   arr[i] = in.nextInt();
        //}

        //for (int i = 0; i < arr.length; i++) {
         //   System.out.println(arr[i]);
      //  }
        //OR
       // for(int num : arr){
         //   System.out.println(num+"");
            //num represent arr[i]
       // }
        //for str
       // for(String element : arr) {
         //   System.out.println(element);
        //}
       //OR
       // System.out.println(Arrays.toString(arr));

       // array of object
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify index 1
        str[1]="Lucky";
        System.out.println(Arrays.toString(str));


    }

    //strings are immutable and arrays are mutable
}
