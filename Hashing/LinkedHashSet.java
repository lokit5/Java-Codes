package Hashing;
import java.util.*;
public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> lhs = new java.util.LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        Iterator it = lhs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : lhs) {
            System.out.println(city);
        }
    }
}
