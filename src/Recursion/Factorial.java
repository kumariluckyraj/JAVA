package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){//we are using int coz it is returning the value and not printing it
        if(n<=1){
            return 1;
        }

        return n*fact(n-1);
    }
}
