package Queue;
import java.util.*;

public class QueueReversal {
    public static void printReverse(Queue q) {
        Stack s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        printReverse(q);
    }
}