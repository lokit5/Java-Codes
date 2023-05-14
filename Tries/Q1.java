package Tries;

import java.nio.file.NotDirectoryException;

public class Q1 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root;

    public static void insert(String str) {
        Node curr = root;
        for(int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static void main(String[] args) {
        String str[] = {"eat","tea", "tan", "ate","nat", "bat"};

        //insert
        for(int i = 0; i < str.length; i++) {
            insert(str[i]);
        }

    }
}
