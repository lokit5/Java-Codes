package BinarySearchTree;
import BinarySearchTree.BuildaBST.Node;

import java.util.ArrayList;

public class ValidateBST {
    public static boolean isValidBST(Node root, Node min, Node max ) {
        if(root == null) {
            return true;
        }
        if(min != null && root.data <= min.data) {
            return false;
        }else if(max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right, root,max);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        //printRoot2Leaf(root, new ArrayList<>());
        System.out.println(isValidBST(root,null,null));
    }
}
