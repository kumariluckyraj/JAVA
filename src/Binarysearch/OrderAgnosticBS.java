public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {22,10,5,4,2,0,-6};
        int target= 0;
        System.out.println(OrderAgBS(arr, target));
    }
    static int OrderAgBS(int arr[], int target){
        int start=0;
        int end= arr.length-1;

        //if sorted in asccending order then return true or else return false
        boolean isAsc = arr[start]<arr[end];

        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start= mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
