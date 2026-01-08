package StackandQueue;

import java.util.*;

public class stack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();//stack is a class
//        stack.push(34);//bfs dfs, trees, recursion to iteration conversion->in these concepts we use stack and queue
//        stack.push(55);
//        stack.push(66);
//        stack.push(54);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

  //queue is an interface
//        Queue<Integer> queue = new LinkedList<>();//ll implemts queue
//        queue.add(3);
//        queue.add(8);
//        queue.add(6);
//        queue.add(6);
//
//        System.out.println(queue.peek());

        //dequeue->an insert and delete from both start and end

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);;
        deque.addLast(55);
        deque.removeFirst();
        //etc etc

    }
}
