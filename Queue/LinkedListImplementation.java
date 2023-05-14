package Queue;

public class LinkedListImplementation {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node (data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(head == null) {
                System.out.println("Empty");
                return -1;
            }
            int data = head.data;
            if(head == tail) {
                tail = head = null;
            } else  {
                head = head.next;
            }
            return data;
        }
    }
}
