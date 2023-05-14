package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        quickSort(arr,si,pidx - 1);
        quickSort(arr,pidx + 1, ei);
    }
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for els smaller than pivot

        for(int j = si; j < ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei]= temp;
        return i;
    }
}
