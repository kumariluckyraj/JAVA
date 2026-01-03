package Recursion;

public class diff {
    public static void main(String[] args) {
fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
       // fun(n--);
        System.out.println(n);
        fun(--n);
        // n-- , --n and n-1 are different
        //n-- will pass the value of n first and then subtract it
        //--n vise versa


    }
}
