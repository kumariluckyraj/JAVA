package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(5);
    }
    static void reverse(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
}
//WHEN TO USE RETURN AND WHEN TO NOT

//Feature	           ReverseNumber  	BinarySearch
//Return type	          void	            int
//Goal	                Print values	Find & return index
//Uses return value?	   ❌ No	       ✅ Yes
//Recursive call	    Just called    	Returned