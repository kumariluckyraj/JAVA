package Recursion;

public class ProductOfNnumbers {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
    static int product(int n){
        if(n%10==n){// if one digit is remaining then return that digit
            return n;
        }

        return (n%10)*product(n/10);
    }
}
