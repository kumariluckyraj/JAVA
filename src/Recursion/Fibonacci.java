package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    //when to use recursion?
    //1. u know it via practice
    //2.if u can break it down to the smaller problems
    //3. write the recurrence relation if needed
    //4. draw the recursive tree
    //5. About the tree
    //   i. see the flow of functions, how then are getting in stack
    //   ii. identfy and focus on left and right tree calls
    //   iii.drwa the tree and ponter again and again using pen and paper
    //   iv. use the debugger to see the flow
    //6. see how values  are returned at each step and see where the func call will come out of and in the end u will come out from the main func



    //fibonacci no.-> 0, 1, 1, 2, 3, 5, 8, 13......
    //                0  1  2  3  4  5  6  7
    //fibo(n) = fibo(n-1)+fibo(n-2) (THIS IS KNOWS AS THR RECURRENCE RELATION)
    //so here fibo(n)in broken into two subparts therfore we will use recursion here
    //fib0(n-1) can be also broken into->fibo(n-2) + fibo(n-3)

    //           i. fibo(5)  THIS IS THE RECURSION TREE
    //            /        \
    //   ii.   fibo(4) + 9. fibo(3)
    //        /    \        /    \
    //iii.fibo(3)+fibo(2) fibo(2)+fibo(1)
    //    /   \    8.      10.      11.
    //iv.fibo(2)+fibo(1)
    // /   \      7.
//v.fibo(1)+fibo(0)
  //           6.
    //we need a base condition in recursion and it is represented by ans we already have
    //for eg we know 0th fibonacci is 0 and 1 fibonacci is 1 so it will called as the base condition


static int fibo(int n){
        //base condition
    if(n<2){
        return n; //0 and 1
    }

        return fibo(n-1)+fibo(n-2);
    // this is not tail recursion cos n-1 is not the last step
}
}


