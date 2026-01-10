package BinaryTree;

import org.w3c.dom.Node;

import java.util.Scanner;

public class binaryTree {
    private static class Node {


        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("enter the root node:");
        int value = scanner.nextInt();//it will take an interger from u
        root = new Node(value);//create a node
        populate(scanner, root);//for creating rest of the tree(children of the above node that u have created)
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do u want to enter left of" + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the left value" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);//a node in the left of the root nade will get created
            populate(scanner, node.left);
        }

        System.out.println("do u want to enter right of" + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the right value" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);//a node in the left of the root nade will get created
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");//pehle left vala sara display hoga
        //indent + "\t" means:-
        //Root → ""
        //
        //Level 1 → "\t"
        //
        //Level 2 → "\t\t"
        //
        //Level 3 → "\t\t\t"
        display(node.right, indent + "\t");//fir right vala sara display hoga
        //e.g:-        10
        //       /  \
        //      5    20
        //     /    /  \
        //    4    19   25
        //   /
        //  4

        //o/p:-
//        10
//           5
//             4
//               4
//          20
//            19
//            25

    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);
        if(level !=0){
            for (int i =0; i<level -1; i++){
                System.out.println("|\t\t");
            }
            System.out.println("|-------->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);

    }

    public void preOrder() {
        preOrder(root);
    }
        private void preOrder(Node node){
            if(node==null){
                return;// base condition
        }
            System.out.println(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;// base condition
        }
        preOrder(node.left);
        System.out.println((node.value + " "));
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;// base condition
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.populate(scanner);
        tree.display();
    }
}

