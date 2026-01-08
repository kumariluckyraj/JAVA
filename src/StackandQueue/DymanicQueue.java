package StackandQueue;

public class DymanicQueue extends CircularQueue{
    public DymanicQueue(){
        super(); //it will call CustomStack()
    }
    public DymanicQueue(int size){
        super(size); //it will call CustomStack(int size
    }

    @Override
    public boolean insert(int item){
        //this takes care of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all the previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i] = data[(front+i)% data.length];
            }
            front = 0;
            end = data.length;
            data=temp;

        }
        //at this point we know that array is not full
        //insert item normally
        return super.insert(item);

    }
}
