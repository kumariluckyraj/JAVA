package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){// it means that it is the first item
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){// You must check first whether the list is empty.
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;


        size+=1;
    }
 public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;//0 is temp itself
     for(int i=1;i<index;i++){//this will till the index-1
         temp = temp.next;
     }
  Node node = new Node(val,temp.next);//temp.next is 7
  temp.next = node;//7
     size++;
 }

    public int deleteLst(){
       if(size<=1){
           return deleteFirst();
       }
       Node secondLast = get(size - 2);
       int val=tail.value;
       tail= secondLast;
       tail.next=null;
       return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLst();
        }
        Node prev =get(index-1);
        int val = prev.next.value;
        prev.next= prev.next.next;
        return val;
    }

    public Node get(int index){//this getter is used for deletelst
        Node node = head;//as we want to move node not head
        //3->    5->1->9
        //head  node(node will move not head as node=head)
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int value){//find the node that has this value
        Node node = head;
       while(node!=null) {
           if (node.value == value) {


               return node;

           }
           node = node.next;
       }
        return null;
    }

public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;

}




    public void dispay(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
