package Recursion.Backtracking;

public class Queen {
    public static void main() {
     int n=4;
     boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {//base condition . end of the baord
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;//Keeps track of how many valid solutions exist from this row onward

        //placing the queen and checking for every row and col
        for(int col=0; col< board.length;col++ ){//We try placing a queen in every column of the current row
            //place the queen if it is safe
            if(isSafe(board, row, col)){
                board[row][col]= true;
                count += queens(board, row+1);
                board[row][col]= false;
            }
        }
        return count;//Return total solutions
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        //check vertical row
        for(int i=0;i<row;i++){//Loop through all rows above the current row
            //eg:i = 0
            //i = 1
            //i = 2
            if(board[i][col]){ //Is there already a queen in this same column?
                return false;
            }

        }

        //daigonal left
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //daigonal right
        int maxRight = Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {//goes thorough each rown in the current board
            for (boolean element : row) {//Goes through each cell in the current row
                if (element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}