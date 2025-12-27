public class Max {
    static void main(String[] args) {
        int[] arr = {1,22,3,4,5};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
//for Range
    //static int max(int[] arr, int start, int end){
      //  int maxValue= arr[start];
        //for(int i=start; i<end; i++){
          //  if(arr[i]>maxValue){
            //    maxValue = arr[i];
            //}
        //}
        //return maxValue;
    //}
}
