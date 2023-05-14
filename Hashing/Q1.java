package Hashing;
import java.util.*;

public class Q1 { // Bottom view of binary tree
    public static class Node {
        Node left, right;
        int data;

        public  Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Info {

        Node node;
        int hd;


        public Info( Node node,int hd) {
            this.hd = hd;
            this.node = node;
        }
    }
    public static void bottomView(Node root) {
        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else {
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
                map.put(curr.hd,curr.node);
            }
        }
        for (int i = min ; i <= max; i++) {
            System.out.print(map.get(i).data+ " ");
        }

    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);

        bottomView(root);
    }
}
