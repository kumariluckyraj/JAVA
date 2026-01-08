package StackandQueue;

public class StackMain {
    public static void main(String[] args) throws StackException{
//        CustomStack stack = new CustomStack(5);
//        stack.push(59);
//        stack.push(55);
//        stack.push(65);
//        stack.push(75);
//        stack.push(85);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


DynamicStack stack = new DynamicStack();
        stack.push(59);
        stack.push(59);
        stack.push(59);
        stack.push(59);
        stack.push(59);
        stack.push(59);
        stack.push(59);
        stack.push(55);
        stack.push(65);
        stack.push(75);
        stack.push(85);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
    }
}
