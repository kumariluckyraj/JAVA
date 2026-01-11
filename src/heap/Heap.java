package heap;


import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    //I am extending comparable objects so that I can compare two objects
    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int first , int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index-1)/2 ; // we are taking index+1 coz we are starting from index 0 and not 1

    }
    private int left(int index){
        return index*2+1;
    }

    private int right(int index){
        return index*2 + 2;
    }

    public void insert(T value){
        //add the element in the last of the tree
        list.add(value);
        //then u have compare the element from the last index while moving up called as upheap
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("removing from an empty heap!");

        }
//this is only getting the value
        T temp = list.get(0);
  // this is removing that value
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }

        return temp;
    }
    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
           //if left exists
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            //if left exists
            min = right;
        }

        if(min != index){ //that is if min is not 0
          swap(min, index);
          downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());//add the the data that u are removing
        }
        return data;
    }

}
