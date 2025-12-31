import java.util.Arrays;

public class selectionSort {
    //selection sort is not stable
    public static void main(String[] args) {
        int[] arr={33,65,8,1,99,65};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            //find max element and swap it with it's currect index
            int last = arr.length-i-1;//if i=0 the last=6-1=5 so the max value that is 99 will go to the index 5
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end){
int max= start;
for (int i=start;i<=end;i++){
    if(arr[max]<arr[i]){
        max=i;
    }
}
return max;
    }
}
