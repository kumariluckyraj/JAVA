package Recursion.Backtracking;

public class Nknights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }
    //HOW TO IDENTIFY WEATHER A PERTICULAR PROBLEM IS BACKTRACKING OR NOT?
    //put a potential answer somewhere and if that is goindg to effect the future ans somewhere then that will be a backtracking problem


    //Rules for Knight:
    //    //
    //    //Knight moves in L shape:
    //    //
    //    //(−2, −1), (−1, −2), (−2, +1), (−1, +2)
    //    //
    //    //Knight does not attack straight or diagonally
    //    //
    //    //We must place 4 knights such that no two attack each other

    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {//if out of bound then just skip it
            return;
        }

        if (col == board.length) {//if u are at end of col then try for the next line
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);//if it is not safe
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {//two time row-1 and col-1 Because first we check whether that position exists, and only then we check whether a knight is placed there.
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {//if it is out of bound or not . it should be inside the matrix
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}