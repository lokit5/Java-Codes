package LinkedList;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;


        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data) {
        //create newNode
        Node newNode = new Node(data);
        //add
        if(head == null) {
            head = tail = newNode;
            ++size;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        ++size;
    }
    //removeFirst
    public int removeFirst() {
        if(head == null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
        tail.next = null;
        size++;
    }
    //removeLast;
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail =  tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    //reversedll
    public void reverseDll() {
        Node curr = head;
        Node prevL = null;
        Node nextL;
        while(curr != null) {
            nextL = curr.next;
            curr.next = prevL;
            curr.prev = nextL;

            prevL = curr;
            curr =nextL;
        }
        head = prevL;
    }

    //print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.print();
        System.out.println(size);
        dll.addLast(4);
        dll.print();
        System.out.println(size);
        dll.removeLast();
        dll.print();
        System.out.println(size);
        dll.reverseDll();
        dll.print();
    }
}
