package Recursion;

public class Numbers {
    public static void main(String[] args) {
num(1);
    }
    static void num(int n){
        System.out.println(n);
        num1(2);
    }
    static void num1(int n){
        System.out.println(n);
        num2(3);
    }
    static void num2(int n){
        System.out.println(n);
        num3(4);
    }
    static void num3(int n){
        System.out.println(n);
        num4(5);
    }
    //function body changes here
    static void num4(int n){
        System.out.println(n);

    }
//Important Points
    //All the numbers have same body and definition
    //if all the functions have same body and is doing the same thing then what is the point of calling it again and again
    //so call the function itself
    //check NumberRecursion file for the code
}
