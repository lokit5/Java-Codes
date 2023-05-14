package Stack;

import java.util.*;

public class Q1 {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Character> s = new Stack<>();
        Node temp = head;
        s.push(temp.data);
        while(temp.next != null) {
            temp = temp.next;
            s.push(temp.data);
        }
        Node node = new Node(s.pop());
        Node temp2 = node;

        while(!s.isEmpty()) {
            temp2.next = new Node(s.pop());
            temp2 = temp2.next;
        }

        while(head.next != null) {
            if(head.data != node.data) {
                return false;
            }
            head = head.next;
            node = node.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('S');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');
        head.next.next.next.next.next = null;

        System.out.println(isPalindrome(head));
    }
}
