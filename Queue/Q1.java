package Queue;

import java.util.*;

public class Q1 {
    public static void printBinary(int n) {
        Queue<String> q = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            q.add(Integer.toBinaryString(i));
        }
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
    public static void main(String[] args) {
        printBinary(5);
    }
}
