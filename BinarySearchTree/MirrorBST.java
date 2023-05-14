package BinarySearchTree;
import BinarySearchTree.BuildaBST.Node;


public class MirrorBST {
    public static void invert(Node root) {
        if(root == null) {
            return;

        }
        if(root.left != null && root.right != null) {
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        invert(root.left);
        invert(root.right);
    }
    public static void preorder(Node root) {
        if(root == null ) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*
                        1
                       / \
                      2   3
                     / \ / \
                    4  5 6  7
        **/
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        //root.left.left.left = new Node();
        //root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        //root.right.right.right = new Node(14);


        int n = 5;
        int k = 2;

        //sumTree(root);
        //preorder(root);
        preorder(root);
        System.out.println();
        invert(root);
        preorder(root);
    }
}
