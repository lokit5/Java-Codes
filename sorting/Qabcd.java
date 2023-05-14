package sorting;

import java.util.Arrays;

public class Qabcd {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] =  temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j <= arr.length -1; j++) {
                min = arr[min] > arr[j] ? j : min;
            }
            //swap
            int temp = arr[min];
            arr[min] =  arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++)  {
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1 ] = curr;
        }
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
