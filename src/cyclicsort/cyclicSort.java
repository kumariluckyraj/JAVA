import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
int[] arr= {3,5,2,1,4};
cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    //when no.s are from range 1 to n we use cyclic sort->extreamly imp
    //eg: 3,5,2,1,4
    //after sorting: 1,2,3,4,5
    //               0 1 2 3 4 index=value-1(index of 2 is 1)
    //3,5,2,1,4
    //0 1 2 3 4
    //is 3 at the correct index?no so swap it with correct index that is 2
    //2,5,3,1,4
    //is 2 at the correct index->no swap it with index no.1 or value 5
    //5,2,3,1,4
    //swap 5 with index 4
    //4,2,3,1,5
    //swap 4 with index3
    //1,2,3,4,5
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;//value-1
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
