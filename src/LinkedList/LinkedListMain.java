package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(1);

        list.insert(117,2);
        System.out.println(list.deleteFirst());
        list.dispay();
        System.out.println(list.deleteLst());
        list.dispay();
        System.out.println(list.delete(1));
        list.dispay();
    }
}
