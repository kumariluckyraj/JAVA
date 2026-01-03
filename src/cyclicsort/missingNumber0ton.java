package cyclicsort;

public class missingNumber0ton {
    public static void main(String[] args) {
        int[] arr= {4,0,2,1};

        System.out.println( missing(arr));
    }

    //0,1,2,3,4
    //0 1 2 3 4
    //we have 4,0,2,1 -> 3 is missing and our aim is to find the missing number. the correct index of 4 is 4 but since 4(n) is missing so we ignore it
    //        0 1 2 3
    //swap value 0 with value at index 0
    //0,4,2,1
    //is 2 at correct index-> yes
    //swap 1 with 4
    //0,1,2,4
    //does 0 index contain 0 ->yes
    //1 contain 1->yes
    //...... 3 conatins 3-> no therefore 3 is the ans(missing value/number)

    //case2:
//if n= 4 and we have 1,0,3,2 after sorting->0,1,2,3
    //                                       0 1 2 3
    //4 is missing(answer=n)
    static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];//corrct index will be the index as the value itself
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {// we do arr[i]<arr.length coz 1 value is missing or not there
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length;
        index++){
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;  // case2: 4 is missing(answer=n)
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}


