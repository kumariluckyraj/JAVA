package Recursion.Medium;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sort(arr,0));
    }

   // static boolean sort(int[] arr){
   //     return helper(arr, 0);
   // }

   // private static boolean helper(int[] arr, int i){
        // base case: reached last index
    //    if(i == arr.length - 1){
    //        return true;
   //     }

        // if current pair is not sorted
     //   if(arr[i] > arr[i + 1]){
     //       return false;
     //   }

        // recursive call
     //   return helper(arr, i + 1);
   // }

    static boolean sort(int[] arr,int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index+1);
    }
}
