package StackandQueue;

public class CustomStack {
    protected int[] data;//stack internally has array
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){//when nothing is passed to it
        this(DEFAULT_SIZE);

    }

    public CustomStack(int size){//constructor
this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from empty stack");

        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        //OR
        return data[ptr--];
    }
    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("cannot peek from empty stack");

        }
        return data[ptr];
    }


    public boolean isFull(){
        return ptr==data.length-1; // ptr is at last index

    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
