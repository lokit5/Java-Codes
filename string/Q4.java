package string;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(isAnagram("earth","heart"));
    }
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
