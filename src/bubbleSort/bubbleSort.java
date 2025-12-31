import java.util.Arrays;
//buuble sort is stable
public class bubbleSort {
    public static void main(String[] args) {
int[] arr= {2,5,78,99,10};
bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length; i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){ //the arr.legth-i means the j will nor go to those lements in the last which is already sorted
                //swap if item is smaller that the previous and incremet j
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped= true;
                }

            }
            if(!swapped){ //no swapp happened it means that the array is already sorted we use swapped to reduce time complexity
                break;
            }
        }
    }
}
