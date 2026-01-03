package Recursion.Medium;

import java.util.Arrays;

public class PattenandmergeSort {

    public static void main(String[] args) {
     // pattern2(4,0);
      int arr[] = {4,3,2,1};
     selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void pattern2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern2(r,c+1);
        }else{
            System.out.println();
            pattern2(r-1,0);
        }
    }

    static void bubble(int[] arr, int r, int c){//c->last index to check
        //r-> current index(inner loop)
        if(r==0){
            return;
        }
        if(c<r){
           if(arr[c]>arr[c+1]){
               //swap
               int temp= arr[c];
               arr[c]=arr[c+1];
               arr[c+1]= temp;

           }
            bubble(arr,r,c+1);
        }else{

            bubble(arr,r-1,0); // outer loop
            //When c == r:
            //One full pass is done
            //Largest element has moved to the end
            //Reduce unsorted range (r - 1)








            //Reset c to 0
        }
    }

    static void selection(int[] arr,int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<=r){
            if(arr[c]>arr[max]){
                max=c;
            }
            selection(arr,r,c+1,max);
        }else{
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            selection(arr,r-1,0,0);
        }
    }

}
