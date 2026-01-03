package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3,4,55,66,78};
    int target = 4;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    //variable:
    //1. Argument
    //2. return type
    //3. body of function

    //in case of Binary Search
    //1. comparing->O(1)
    //2. Dividing into 2 half
    //f(n)-> O(1)+f(n/2)
    //       1.    2.

    //TYPES OF RECURENCE RELN->
    //1. linear RR -> fibonacci
    //2. divide and conquere-> binary search
    //2nd  RR reduces space complexity very very much when compared to 1st RR

    static int search(int arr[], int target, int s, int e){
        //base condition
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2; // this variable m is not nessary to retuen the ans unlinke s and e so we will define it in the body of the function
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
           return search(arr, target, s,m-1);
            //make sure to return the result of a function call of the return type
        }
           return search(arr,target,m+1,e);
//see the notes for the tree
    }

}

