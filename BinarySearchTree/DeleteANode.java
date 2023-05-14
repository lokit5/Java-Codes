package BinarySearchTree;
import BinarySearchTree.BuildaBST.Node;
public class DeleteANode {
    public static Node delete(Node root, int val) {
        if(root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left,val);
        }else { //voila
            //case 1 - leaf node
            if(root.left == null && root.right == null) {
                return null;
            }
            //case 2 - single child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            //case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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
        inorder(root);
        System.out.println();
        delete(root,5);
        inorder(root);
    }
}
