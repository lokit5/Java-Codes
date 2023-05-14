package sorting;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        String[] arr = {"sun","earth","mars","mercury"};
        mergeSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(String[] arr, int si, int ei) {
        //base
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid + 1,ei );

        merge(arr,si,mid,ei);
    }
    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si, j = mid + 1, k=0;
        //sorting
        while(i <= mid && j <= ei) {
            if(arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of 2nd sorted part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        //for leftover elements of 2nd sorted part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for(k = 0, i = si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }

    }
}
