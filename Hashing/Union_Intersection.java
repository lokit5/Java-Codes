package Hashing;

import java.util.HashSet;

public class Union_Intersection {
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            h.add(arr2[i]);
        }
        for(Integer i : h) {
            System.out.print(i + ",");
        }
        System.out.println();
        return h.size();
    }
    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        int count = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(h.contains(arr2[i])) {
                count++;
                h.remove(arr2[i]);
                System.out.print(arr2[i]+ ",");
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println("Union = "+union(arr1,arr2));
        System.out.println("Intersection = "+intersection(arr1,arr2));
    }
}
