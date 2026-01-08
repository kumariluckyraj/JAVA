package StackandQueue;

public class CustomQueue {
    protected int[] data;//stack internally has array
    private static final int DEFAULT_SIZE = 10;
    int end = 0;//adding the item increasing the end
    public CustomQueue(){//when nothing is passed to it
        this(DEFAULT_SIZE);

    }

    public CustomQueue(int size){//constructor
        this.data = new int[size];
    }

    public boolean isFull(){
        return end==data.length; // ptr is at last index

    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;//first it will assign item to end and then increase end
       return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new StackException("cannot remove from empty queue");

        }

        int removed = data[0];
        //shift element to left
        for (int i=1;i<end; i++){
            data[i-1] = data[i];//prev element will be equall to next
        }
        end--;
        return removed;

    }

    public int front() throws StackException {
        if(isEmpty()){
            throw new StackException("cannot remove from empty queue");

        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.println(data[i]+"");
        }
        System.out.println("END");
    }

}
