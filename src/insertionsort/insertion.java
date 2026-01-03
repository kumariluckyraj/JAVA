package insertionsort;

import java.util.Arrays;

public class insertion {
   public static void main(String[] args) {

           int[] arr= {2,5,78,99,10};
           insertion(arr);
           System.out.println(Arrays.toString(arr));

    }
    //in insertionsort.insertion sort no. of steps are reduced if the array is aready sorted then the loop will break
    //it is stable
    //used for smalled values of n and works good when the array is partially sorted so it takes part in hybrid sorting algo(combined bubble and selection sort)
    static void insertion(int[] arr){
       for(int i=0;i<arr.length-1;i++){// we take i till arr,length that is n-2 coz if i goes till array.length then j will have to go 1 setp mare that i and that will be arrayindexoutofbound
           for(int j=i+1;j>0;j--) {//j should be always greater that 0
               if(arr[j]<arr[j-1]){
                   swap(arr, j, j-1);
               }else{
                   break;//coz the left side of the array is already sorted so break
               }
           }

           }

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
