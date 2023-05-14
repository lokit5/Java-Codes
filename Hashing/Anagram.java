package Hashing;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(map.get(ch) == null) {
                return false;
            }
            else if(map.get(ch) != 1) {
                map.put(ch,map.get(ch) - 1);
            } else {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "hewrt", s2 = "earth";
        System.out.println(isAnagram(s1,s2));
    }
}
