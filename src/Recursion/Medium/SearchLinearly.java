package Recursion.Medium;

import java.util.ArrayList;

public class SearchLinearly {
    public static void main(String[] args) {
        int[] arr ={22,55,66,55,57};
        int target=55;
       // findAllIndex2(arr,0,target,list);
      //  System.out.println(list);

        System.out.println(findAllIndex3(arr, 0, target));
    }
    static int search(int[] arr,int i,int target){

        if(i==arr.length){
            return -1;
        }
        // found target
        if(arr[i] == target){
            return i;
        }

        return (search(arr,i+1,target));
    }


    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int i,int target){

        if(i==arr.length){
            return ;
        }
        // found target
        if(arr[i] == target){
            list.add(i);
        }

        findAllIndex(arr,i+1,target);
    }

    //OR
    static ArrayList<Integer> findAllIndex2(int[] arr,int i,int target, ArrayList<Integer> list){
        if(i==arr.length){
            return list ; //Because your method’s return type is ArrayList<Integer>, it MUST return an ArrayList<Integer>, not nothing.
        }
        // found target
        if(arr[i] == target){
            list.add(i);
        }

        return findAllIndex2(arr,i+1,target,list);
    }

    //OR
//but don't use this approach
    //don't take the list in the argument.
    //create the list in the body itself
    //then new list will be created every single time if we include it inside the body and that is an issue


    static ArrayList<Integer> findAllIndex3(int[] arr,int i,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list ; //Because your method’s return type is ArrayList<Integer>, it MUST return an ArrayList<Integer>, not nothing.
        }
        // found target
        //this will contain answer for that perticular function call only
        if(arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> ansfromBelowCalls = findAllIndex3(arr,i+1,target);
        list.addAll(ansfromBelowCalls);// if that list contains any value then add it in the list that is coming from below
        return list;



                }



}
