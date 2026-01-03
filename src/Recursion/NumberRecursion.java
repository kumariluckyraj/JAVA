package Recursion;

public class NumberRecursion {
    public static void main(String[] args) {
        num(1);
    }
    static void num(int n){
        if (n==5){
            System.out.println(5);
            return;  //execute if the value of n is 5 as the function body is changes when n==5 (in Numbers file) so u just simply return
        }
        System.out.println(n);
        num(n+1);
        //this is the tail recursion coz n+1 is the last step
    }
    //Therefore a func that calls itself is called as Recursion.
    //it helps us in solving bigger complex problems in simple way
    //u can convert recusion soln into iteration(loop) and vise-versa
    //space complexity is not constant coz of recursive calls
    //breaks bigger prblms into smaller prblms


}
