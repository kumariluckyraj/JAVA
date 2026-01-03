package Pattern;

public class patten1 {
    public static void main(String[] args) {
    patten6(5);
    }
    // *
    // * *
    // * * *
    // * * * *
    //1st row->1col, 2nd row->2col...., 4th row->4col
    static void patten1(int n){
        for(int row=1;row<=n;row++){//step1
            for(int col=1;col<=row;col++){//step2
                System.out.print("*");//step3
            }
            System.out.println();
        }

    }

    // step1: look at the pattern, see how many lines the patten and run the outer loop that many times
    //step2: identify how many cols are there in evrery row(here->no.of col=no.of row) or types of element in the col(here->* types of col are there)
    //step3: what do u need to print(here->*)
    //when one row is printer we need to add new line

// * * * * *
// * * * * *
// * * * * *
// * * * * *
static void patten2(int n) {
        for(int row=1; row<=n; row++){
            for(int col=1;col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }

}
//try to find the formula

//n=5
// * * * * *  1 row (5 col)  n+1-r
// * * * *    2 row (4 col)  n+1-r
// * * *      3 row (3 col)  n+1-r
// * *        4 row (2 col)  n+1-r
// *          5 row (1 col)  n+1-r
static void patten3(int n) {
        for(int row=1; row<=n; row++){
            for(int col=1;col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
static void patten4(int n) {
    for(int row=1; row<=n; row++){
        for(int col=1;col<=row; col++){
            System.out.print(col);
        }
        System.out.println();
    }

}



//1 2 3 4
//1 2 3
//1 2
//1

    static void patten5(int n) {
        for(int row=1; row<=n; row++){
            for(int col=1;col<=n-row+1; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }


// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
//total we have 9 number of rows (2n-1, where n=5)
//the col value starts decreasing after the value of n
//if rowno.>n:

//else:
//  col = row
    static void patten6(int n) {
        for(int row=1; row<=2*n-1; row++){
            for(int col=1;col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
