package BinarySearchTree;
import BinarySearchTree.BuildaBST.Node;
public class SearchInBST {
    public static boolean search(Node root,int key) {
        if(root == null ) {
            return false;
        }
        if(key > root.data) {
            return search(root.right,key);
        }else if(key < root.data) {
            return search(root.left,key);
        }else {
            return true;
        }
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
        System.out.println(search(root,8));
    }
}
