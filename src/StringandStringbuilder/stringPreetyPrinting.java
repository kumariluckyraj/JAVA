package StringandStringbuilder;

import java.util.Arrays;

public class stringPreetyPrinting {
   public static void main(String[] args) {
      // System.out.println(new int[]{2,3,4,5});
       //o/p->[I@27716f4
       System.out.println(Arrays.toString(new int[]{2,3,4,5}));
       //o/p->[2, 3, 4, 5](preety printing)
       //placeholder:-
       System.out.printf("hello my name is %s and i am %s","lucky","your mother");
    }
}
