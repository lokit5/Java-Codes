package GreedyAlgorithm;

public class Q1 {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        int r = 0, l = 0;
        int count = 0;

        for(int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            if(ch == 'R') {
                r++;
            } else {
                l++;
            }
            if(r == l) {
                count++;
            }
        }
        System.out.println(count);
    }
}
