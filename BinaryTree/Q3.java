package BinaryTree;
import BinaryTree.HeightOfATree.Node;
//delete leaf node
public class Q3 {
    public static Node delete(Node root, int x) {
        if(root == null ) {
            return null;
        }
        root.left = delete(root.left,x);
        root.right = delete(root.right,x);
        if(root.left == null && root.right == null && root.data == x) {
            return null;
        }
        return root;
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
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        //root.right.left = new Node(6);
        //root.right.right = new Node(7);

        delete(root,3);
        preorder(root);
    }
}
