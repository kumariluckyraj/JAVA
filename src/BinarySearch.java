public class BinarySearch {
    static void main(String[] args) {
       int[] arr = {-2,0,5,6,12,18,100,800};
    int target=18;
        System.out.println(binarySearch(arr,target));

    }
    //let the array is sorted in asccending order and the bellow given conditions are opp for decending sorted array
    //find the middle element
    //if target>mid -> search in the right side buy making start as mid+1
    //else in left side by making end as mid-1
    //if middle element== target element then that is the answer
//if start>end then target does not exist
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2; // we don't write mid= (start+end)/2 coz int has fixed size and it might exceed that fixed size

            if(target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else{
                //target=mid
                return mid;
            }
        }
        return -1;
    }

}
