package StackandQueue;

public class CircularQueue {
    protected int[] data;//stack internally has array
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;//adding the item increasing the end
    protected int front = 0;
    private int size =0;
    public CircularQueue(){//when nothing is passed to it
        this(DEFAULT_SIZE);

    }

    public CircularQueue(int size){//constructor
        this.data = new int[size];
    }

    public boolean isFull(){
        return size==data.length; // ptr is at last index

    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;//let end = 3 do end++=4
        end = end % data.length;//let data.length = 5, end = 4 % 5 = 4;   // unchanged
        //end = 5;
        //data.length = 5;

       // end = 5 % 5 = 0;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new StackException("cannot remove from empty queue");

        }

        int removed = data[front++];
        front =  front%data.length;
        size--;
        return removed;

    }
    public int front() throws StackException {
        if(isEmpty()){
            throw new StackException("cannot remove from empty queue");

        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        int i = front;
        do{
            System.out.println(data[i]+"->");
            i++;
            i %=data.length;
        } while(i !=end);
        System.out.println("END");
    }
}
