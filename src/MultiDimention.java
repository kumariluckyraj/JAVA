import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];//initializing it
        //[row] [column]. it is nessasary to specify the row value not the column value
        //int[][] arr = {
        //        {1, 2, 3}, 0th index
        //        {4,5},     1st ""
        //        {6,7,8,9}  2nd ""
       // }
        System.out.println(arr.length); // prints number of rows
        //to take input

        for (int row=0; row<arr.length; row++){// this is for row as arr.lenght prints the row value
            //for columns
            for (int col=0; col<arr[row].length; col++){ // arr[row].length length of elements in each row of the array
                  arr[row][col] = in.nextInt();
            }
        }
        //to take the output
          //  for (int row=0; row<arr.length; row++){// this is for row as arr.lenght prints the row value
                //for columns
          //      for (int col=0; col<arr[row].length; col++){ // arr[row].length length of elements in each row of the array
          //          System.out.print(arr[row][col]+"");
          //      }
          //      System.out.println(); //for printing array in the new line like a new matrix
        //}

        //OR
       // for (int row=0; row<arr.length; row++) {// this is for row as arr.lenght prints the row value
        //    System.out.println(Arrays.toString(arr[row]));
      //  }
        //OR
        for(int[] a : arr) {// every single element itself is an array
            System.out.println(Arrays.toString(a));
        }
    }
}
