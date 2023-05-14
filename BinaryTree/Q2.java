package BinaryTree;
import BinaryTree.HeightOfATree.Node;
//InvertBinaryTree
public class Q2 {
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 5;
        int k = 2;

        //sumTree(root);
        //preorder(root);
        invert(root);
        preorder(root);
    }
}
