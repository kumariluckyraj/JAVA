package Recursion.StringSubsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class WithoutRecursionandWithIteration {
    static void main(String[] args) {

    }

static List<List<Integer>> subset(int[] arr) {
    List<List<Integer>> outer = new ArrayList<>();//this is my outer list

    outer.add(new ArrayList<>());
    for(int num:arr){
        int n = outer.size();
        for(int i=0;i<n;i++){
            List<Integer> internal = new ArrayList<>(outer.get(i));//new internal list
           internal.add(num) ;
           outer.add(internal);
        }
    }
    return outer;

}

}
