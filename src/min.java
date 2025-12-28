public class min {
    public static void main(String[] args) {
        int[] nums={2, 5, 8, 7,1,8};

        int ans = minimum(nums);
        System.out.println(ans);

    }
    static int minimum(int[] arr){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int minValue=arr[0];
        for (int i=0;i<arr.length;i++){

            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
        return minValue;
    }
}
