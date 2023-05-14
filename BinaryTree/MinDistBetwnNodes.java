package BinaryTree;
import BinaryTree.HeightOfATree.Node;
public class MinDistBetwnNodes {

    public static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(rightLca == null) {
            return leftLca;
        }
        if(leftLca == null) {
            return rightLca;
        }
        return root;
    }
    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int ld = lcaDist(root.left,n);
        int rd = lcaDist(root.right,n);

        if(ld == -1 && rd == -1) {
            return -1;
        } else if(ld == -1) {
            return rd + 1;
        } else {
            return ld + 1;
        }
    }
    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root,n1,n2);
        int d1 = lcaDist(lca,n1);
        int d2 = lcaDist(lca, n2);

        return d1 + d2;

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

        int n1 = 2;
        int n2 = 6;

        System.out.println(minDist(root,n1,n2));
    }
}
