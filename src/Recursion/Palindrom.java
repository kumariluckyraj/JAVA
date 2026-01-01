package Recursion;

public class Reversenum {
    public static void main(String[] args) {

        System.out.println(palin(1234321));
    }

    //eg n->1824
    // reverse->4281
    //take the last number and reverse it
    static int rev(int n){
        int digits = (int)(Math.log10(n))+1;//calcultes the number of digit
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem *(int) (Math.pow(10, digits-1))+helper(n/10,digits-1);
    }
   static boolean palin(int n){
        return n == rev(n);
   }
}

//we use helper func coz:->
//digits changes every call — but power positions must decrease predictably

//You end up recalculating digits unnecessarily

//The recursion logic becomes incorrect and inefficient

//We use a helper function because recursion needs extra information (digits) that should NOT be part of the public API.