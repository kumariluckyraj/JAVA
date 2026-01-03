package Binarysearch;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));

    }
    //if matrix is sorted the take the middlle col let col 1 be the middle
    //then take middle element from that col let 6(6>target(2))
    //below 6 all elements is greater than 6 that means greater that 2 so eleminate below rows of 6 (i.e 2 and 3)
    //all cases:
    //if element==target (ans)
    //if element > target (ignore rows ater it)
    //element<target (ignore above rows)
    //this is how we are reducing the search space
    //lb->rowstart and ub->rowend
    //rowstart 0 {{1,2,3,4},
    //  middle 1  {5,6,7,8},
    //         2  {9,10,11,12},
    //rowend   3  {13,14,15,16}}
    //in the end 2 rows are remaining that us 0 and 1
    //check weather the mid col u are at(col1) contains the ans
    //let target=3 ignore the element2 and 6 coz 3 is not there in it and consider the four parts
    //part1:1 , part2:5, part3:3,4 , part4:7,8


    //do simple binary search in these four parts
    static int[] simpleBinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        //int row->in which row do u want to search
        //int cStart and cEnd-> from which col to which col of that row u want to search
        while (cStart < cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        //if matrix is of 1dimention
        int rows = matrix.length;
        int cols = matrix[0].length;//no. of cols in 1st row. be cautious matrix may be empty

        if (rows == 1) {
            return simpleBinarySearch(matrix, 0, 0, cols - 1, target);
        }

        //run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            //while this is true we hae more than 2 rows
            //so check those 3 cases to eleminate it
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {//midle elecment from middle col
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {//ignore the above rows
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
//now we have 2 rows
        //check weather the mid col u are at(col1) contains the ans
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return simpleBinarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return simpleBinarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
//superrrr confusingggggggg