package LinkedList;

public class LinkedList<C> {

    public  static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head =  tail = newNode;
        }
        //step2 - newNode next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }
    public void addLast(int data) {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
        }
        //step2 - newNode = tail
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        //i = idx - 1
        newNode.next = temp.next;
        temp.next =  newNode;
    }
    public int removeFirst() {
        if(size == 0 ) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
     if(size == 0) {
         System.out.println("LL is empty");
         return Integer.MIN_VALUE;
     }else if(size == 1) {
         int val = head.data;
         head = tail = null;
         size = 0;
         return val;
     }
     // prev : i = size - 2
        Node prev = head;
        for(int i = 0; i < size - 2; i++ ) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1 ) {
            return -1;
        }
        return idx + 1;
    }

    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz) {
            head = head.next;
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public int recSearch(int key) {
        return helper(head,key);
    }
    public void reverse() {//O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkpalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right  = prev;//right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left & right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public void zigzag(Node head) {
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse the right list
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        Node temp = new Node(-1);
        Node nextL, nextR;

        //merge int zigzag formation
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(3);
        ll.add(2,9);
        ll.printLL();
        //System.out.println(ll.size);
        //ll.removeFirst();
        //ll.removeLast();
        ll.head = ll.mergeSort(head);
        ll.printLL();
        //ll.zigzag(head);
        ll.printLL();
        ll.zigzag(head);
        ll.printLL();

//        System.out.println(ll.itrSearch(5));
//        System.out.println(ll.recSearch(6));
//        ll.reverse();
//        ll.printLL();
//        ll.deleteNthfromEnd(1);
//        ll.printLL();
//        ll.addLast(6);
//        ll.addFirst(9);
//        ll.addLast(6);
//        ll.printLL();
//        System.out.println(ll.checkpalindrome());
        //System.out.println(ll.isCycle());
    }

}
