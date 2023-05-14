package Recursion;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(length("abcde"));
    }
    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
}
