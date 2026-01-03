package cyclicsort;

import java.util.*;

public class googlemissingNo {
    public static void main(String[] args) {
        int[] arr= {3,2,3,4,1,2,7,8};

        System.out.println(googlemissingno(arr));
    }
//sorted array
    //1,2,3,4,3,2,7,8
    //0 1 2 3 4 5 6 7
    //at index no. 4 do we have 4+1 no->take 4+1(5) is missing
    //at index no. 5 do we have 5+1 no->take the 5+1(6) is missing
public static List<Integer> googlemissingno(int[] arr) {
    int i = 0;
    while (i < arr.length) {
        int correctIndex = arr[i] - 1;//value-1
        if (arr[i] != arr[correctIndex]) {
            swap(arr, i, correctIndex);
        } else {
            i++;
        }
    }
    //finding missing no.
    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < arr.length;
         index++) {
        if (arr[index] != index + 1) {
            ans.add(index + 1);
        }

    }
    return ans;


}
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
