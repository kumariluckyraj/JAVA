package Binarysearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr ={ {10, 20, 30, 40},
         {11, 25, 35, 45},
          {28, 29, 37, 49},
       {33, 34, 38, 50}};

        System.out.println(Arrays.toString(search(arr, 37)));
    }
    //if a 2d matrix is sorted in row wise and column wise
    // then to find the target element we can normally do the search in 2d array but that will increase the time complexity
    // therefore we do binary search in 2d array
    // case1: element == target
    //case2: element<target
    //case 3: element>target
    // out aim is to reduce the no. of rows and columns
    //lower bound= 1st col,1st row{1,1}
    //upper bound= {1,end col of 1st row}
    //{ {10, 20, 30, 40}, 10->lb and 40->up 40 is greater that 37(target) so all the element in that col>target so we eleminate it so col--(case1)
    //  {11, 25, 35, 45}, now 30->up 30 is less than target(case2) so all the numbers in the left hand side of 30 is going to besmaller than 30 and target so we elminatate that row row++
    //  {28, 29, 37, 49}, now 35 is again less than target so row++
    //  {33, 34, 38, 50}} now we are at 37 and 37=target hence,ans found
    static int[] search(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){

            if(matrix[r][c]<target){
                r++;
            }else if(matrix[r][c]>target){
                c--;
            }
            else{
                return new int[]{r,c};
            }
        }
        return new int[]{-1,-1};
    }
}
