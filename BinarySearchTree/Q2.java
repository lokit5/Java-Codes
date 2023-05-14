package BinarySearchTree;
import BinarySearchTree.BuildaBST.Node;
public class Q2 {
    //Closest element in BST
    static int min_diff, min_diff_key;
    public static void maxDiffUtil(Node root, int k) {
        if(root == null) {
            return;
        }
        if(min_diff > Math.abs(root.data - k)) {
            min_diff = Math.abs(root.data - k);
            min_diff_key = root.data;
        }
        if(k < root.data) {
            maxDiffUtil(root.left,k);
        } else {
            maxDiffUtil(root.right,k);
        }
    }
    public static int maxDiff(Node root, int k) {
        min_diff = Integer.MAX_VALUE;
        min_diff_key = -1;
        maxDiffUtil(root,k);
        return min_diff_key;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);

        System.out.println(maxDiff(root,5));
    }
}
