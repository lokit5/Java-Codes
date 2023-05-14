package sorting;

import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,3,2};
        inbuiltSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void inbuiltSort(int[] arr) {
        Arrays.sort(arr);
    }
}
