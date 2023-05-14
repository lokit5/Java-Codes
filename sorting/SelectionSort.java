package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr =  {5,4,1,3,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++ ) {
            int miniPos = i;
            for(int j = i + 1; j <= arr.length - 1; j++) {
                miniPos= arr[miniPos] > arr[j] ? j : miniPos;
            }
            //swap
            int temp = arr[miniPos];
            arr[miniPos] = arr[i];
            arr[i] = temp;
        }
    }
}
