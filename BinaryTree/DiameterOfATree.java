package BinaryTree;

import BinaryTree.HeightOfATree.Node;

public class DiameterOfATree {

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = height(root.right);

        int sd = lh + rh + 1;

        return Math.max(sd, Math.max(ld,rd));
    }

    static class Info {
        int dia;
        int ht;

        public Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }
    //optimised
    public static Info diaOptimised(Node root) {
        if(root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diaOptimised(root.left);
        Info rightInfo = diaOptimised(root.right);

        int diameter =  Math.max(leftInfo.dia, Math.max(rightInfo.dia,leftInfo.ht + rightInfo.ht + 1));
        int h = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diameter,h);
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

        //System.out.println(diameter(root));
        System.out.println(diaOptimised(root).dia);
    }
}
