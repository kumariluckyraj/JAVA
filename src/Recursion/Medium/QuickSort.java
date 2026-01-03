package Recursion.Medium;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
int[] arr = {3,5,7,8,4,2,8};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //not stable
    //Pivot-> choose any element after the first pass
    //all the elements<pivot will be on the lhs of pivot
    //all the element>pivot will be on the rhs of the pivot
    // so by doing this after every pass you are putting the pivot in it's right position
    //e.g-> 5,4,3,2,1 pivot->4
    //1,3,2,4,5   4 is at it's right position
    //3->p
    //1,2,3,4,5
    //1->p  // not needed coz in merge sort when the array is sorted then also it will go to the end , till the base condition but not in case of quick sort
    //1,2,3,4,5 //not needed


    //how?
    //5 , 4, 3, 2, 1
    //s   p        e
    //s>p(in right side)->violation
    //e<p(in left side)-> violation hence swap s with e
    // 1, 4, 3, 2, 5   e-1,s+1
    //   s,p    e
    //s=p->violation
    //e<p->violation hence swap
    // 1, 2, 3, 4, 5
    //      s,e p
    // s<p
    //e<p->violation bot ignore as e is also s
    //now 4 is at correct position
// take always the middle element as pivot
//mergesort is better in linked list due to memory allocation->not contiguous


    static void sort(int[] nums,int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s) / 2;
        int pivot = nums[m];

        while(s<=e){
            //also a reason why if the array is already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

           if( s<=e ){
               int temp = nums[s];
               nums[s] = nums[e];
               nums[e] = temp;
               s++;
               e--;

           }
        }
        //now my pivot is at correct index, please sort two halves now
        sort(nums,low,e);
        sort(nums,s,high);
    }

}
