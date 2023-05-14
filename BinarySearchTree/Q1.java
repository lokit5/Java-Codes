package BinarySearchTree;
import BinarySearchTree.BuildaBST.Node;

import java.util.ArrayList;

public class Q1 {
    //search in given range
    public static void inorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static int sumInRange(Node root, int L, int R) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= L && arr.get(i) <= R) {
                sum +=  arr.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);

        System.out.println(sumInRange(root,8,12));
    }
}
