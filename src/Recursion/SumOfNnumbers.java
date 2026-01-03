package Recursion;

public class SumOfNnumbers {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
        //if n= 1342 then n%10->2 and n/10->134
    }

}
