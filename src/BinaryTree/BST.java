
package BinaryTree;


public class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    //the value will be compared with only one node at every level
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;

    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }


    //in bst what if the array is sorted?
    //so it will create one line tree which is not good
    //therefore we will take the middle element of the sorted array make it the root node and the construct the tree
    //1,2,3,4,5,6,7,8,9,10
    //middle element=5
    //then call lhs and then rhs
    //in lhs again take the middle=2
    //call again lhs and rhs of 2
    //lhs of 2 = 1
    //rhs=3 and then 4
    //rhs of 5 = take the middle element = 8
    //lhs of 8 = 6 and then 7
    //rhs of 8 = 9 and 10
    //                5
    //              /   \
    //             2     8
    //            / \   / \
    //           1   3 6   9
    //                \     \
    //                 4     10
//time complexit in nlog(n)


    public void populateSorted(int[] nums) {
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);//for lhs. we are taking mid and ant mid-1 coz end is exclusive
        populateSorted(nums, mid+1, end);//for rhs. here end is excluded coz end is nums.length which is array index 10 and in 10 there is no element
    }



    public void display() {
        display(this.root, "root node:");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "left child of" + node.getValue() + ":");
        display(node.right, "right child of" + node.getValue() + ":");
    }


}

