package Hashing;

import java.util.HashSet;

public class CountDistinctElements {

    public static int count(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        return h.size();
    }

    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(count(num));
    }
}
