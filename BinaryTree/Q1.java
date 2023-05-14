package BinaryTree;
import BinaryTree.HeightOfATree.Node;
//Univalued Tree
public class Q1 {
    public static boolean isUnivalued(Node root) {
        if(root == null ) {
            return true;
        }
        if(root.left != null && root.data != root.left.data) {
            return false;
        }
        if(root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
    }
    public static void main(String[] args) {
        /*
                        2
                       / \
                      2   2
                     / \
                    5  2
        **/
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        //root.right.left = new Node(6);
        //root.right.right = new Node(7);
        System.out.println(isUnivalued(root));
    }
}
