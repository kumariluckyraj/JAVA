package Recursion.Medium;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
       int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    //divide the array in to two parts
    //sort the 1st part then the 2nd part
    //at last merge it by:
    //taking two pointer in each part
    //eg-> 8,3,4,12,5,6
    //part1-> 3,4,8     part2->5,6,12
    //3 is smaller or 5 is smaller->3
    //4" or 5 is smaller->3,4
    //8 is "" or 5 ""->3,4,5
    //8 is "" or 6 is ""->3,4,5,6
    //8 is "" or 12 ""->3,4,5,6,8
    //12 or 12->3,4,5,6,8,12(sorted array)

    static int[] mergesort(int[] arr){// not void coz we are returning a new array
        //base condition
        if(arr.length<=1){
            return arr;
        }
int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));//copyorange copies the range of an array into a new array. mid is exclusive
        int[] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));
return merge(left,right);



    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;//pointer for first arr
        int j=0;//pointer for second arr
        int k=0;//pointer for the new arr

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]= first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one arr gets into te new arr than another so that array gets finished and the other array remaning with it remaining element will get added into the new arr as it is without doing any check as the other arr is aready finished
        while(i<first.length){
            mix[k]= first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]= second[j];
            j++;
            k++;
        }
return mix;
    }
}
