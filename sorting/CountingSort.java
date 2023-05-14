package sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countingSort(int[] arr) {
        int largest = arr[0];
        for(int i = 1 ; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int[] count = new int[largest + 1];
        for(int i = 0 ; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
