package Hashing;
import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> tm;
        tm = new java.util.TreeMap<>();
        tm.put("India",100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm); //order remains

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);//no order
    }
}
