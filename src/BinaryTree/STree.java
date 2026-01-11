package BinaryTree;

 public class STree {


     private static class Node {
         int data;
         int startinterval;
         int endinterval;
         Node left;
         Node right;

         public Node(int startinterval, int endinterval) {
             this.startinterval = startinterval;
             this.endinterval = endinterval;
         }
     }

     Node root;

     public STree(int[] arr) {
         //create a tree using this arr
         this.root = constructTree(arr, 0, arr.length - 1);
     }

     private Node constructTree(int[] arr, int start, int end) {
         if (start == end) {
             //leaf node
             Node leaf = new Node(start, end);
             leaf.data = arr[start];
             return leaf;
         }
         //create new node with index you are at
         Node node = new Node(start, end);
         int mid = (start + end) / 2;

         node.left = this.constructTree(arr, start, mid);

         node.right = this.constructTree(arr, mid + 1, end);


         node.data = node.left.data + node.right.data;
         return node;
     }

     public void display() {
         display(this.root);
     }

     private void display(Node node) {
         String str = "";

         if (node.left != null) {
             str = str + "Interval=[" + node.left.startinterval + "-" + node.left.endinterval + "] and data: " + node.left.data + " => ";

         } else {
             str = str + "No left child";
         }

         //for current nod
         str = str + "Interval=[" + node.startinterval + "-" + node.endinterval + "] and dat: " + node.data + " <= ";

         if (node.right != null) {
             str = str + "Interval=[" + node.right.startinterval + "-" + node.right.endinterval + "] and data: " + node.right.data + " => ";
         } else {
             str = str + "No right child";
         }
         System.out.println(str);


         //call recursion
         if (node.left != null) {
             display(node.left);
         }

         if (node.right != null) {
             display(node.right);
         }
     }
 }

 //NOT ABLE TO UNDESTAND