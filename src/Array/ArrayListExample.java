import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
         ArrayList<Integer> list = new ArrayList<>();
        // list.add(345);
         //list.add(5676);
// take input
         for(int i =0; i<5; i++){
             list.add(in.nextInt());
         }
         //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));// pass index here, list[index] will not wrk here
        }
        System.out.println(list);

    }
}
