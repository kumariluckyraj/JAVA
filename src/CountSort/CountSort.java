package CountSort;

public class CountSort {

    public static void countSort(int[] array){
        if (array ==null || array.length <=1){
            return;
        }

        int max = array[0];
        for(int num:array){
            if(num>max){
             max = num;
            }
        }
 int[] countArray = new int[max+1];//new array of frequency count got created

        for(int num : array){
            countArray[num]++;//num =3 so coutArray ka index 3 pe 1 jaega

        }

        int index = 0;
        for(int i=0; i<=max; i++){//run through that frequency array
            while(countArray[i]>0){
                array[index]=i;//0th index se start hoga
                index++;
                countArray[i]--;
            }
            //What happens WITH countArray[i]-- ✅
            //
            //Step-by-step for i = 3:
            //
            //Step	countArray[3]	Action
            //1	           2	 put 3 in array
            //2            1	 put 3 in array
            //3          0	     stop

        }
    }
}
