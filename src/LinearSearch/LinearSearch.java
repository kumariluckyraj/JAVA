public class LinearSearch {
    public static void main(String[] args) {
int[] nums={2, 5, 8, 7,5,8};
int target= 8;
boolean ans = linearSearch3(nums, target);
        System.out.println(ans);

    }

    //search in the array and return the index if the element is = to the target
    //if no element is in the array and if no target element is in the array then return -1

    //static int linearSearch(int[] arr, int target){
     //   if(arr.length==0){
      //      return -1;
       // }
    //    for(int i=0; i<arr.length; i++){
    //        int element = arr[i];
    //        if(element == target){
    //            return i;
    //        }
    //    }
    //    return -1;
    //}

    //output is elemetn and not index
    static int linearSearch2(int[] arr, int target){
      if(arr.length==0){
        // return -1; but what if -1 exists as an element do we will use Integer.MAX_VALUE coz it gives some constant
     return Integer.MAX_VALUE;
      }
       for(int element: arr){

          if(element == target){
              return element;
         }
      }
      return Integer.MAX_VALUE;
    }
    //o/p to be true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            // return -1; but what if -1 exists as an element do we will use Integer.MAX_VALUE coz it gives some constant
            return false;
        }
        for(int element: arr){

            if(element == target){
                return true;
            }
        }
        return false;
    }
}
