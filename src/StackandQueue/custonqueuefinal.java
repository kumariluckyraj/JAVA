package StackandQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;
    int front = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[++end] = item;
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Cannot remove from empty queue");
        }

        int removed = data[front++];

        // Reset queue when it becomes empty
        if (front > end) {
            front = 0;
            end = -1;
        }

        return removed;
    }

    public int peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Cannot peek from empty queue");
        }

        return data[front];
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return front > end;
    }
}