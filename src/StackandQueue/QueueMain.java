package StackandQueue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(8);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);

        queue.display();
    }
}
