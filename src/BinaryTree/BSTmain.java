package BinaryTree;

public class BSTmain {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);
        tree.display();
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
}//time complexit in nlog(n)
