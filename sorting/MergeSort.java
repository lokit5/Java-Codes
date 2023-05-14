package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr,0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if(si >= ei) {
            return ;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si , mid);
        mergeSort(arr,mid + 1,ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; //idx for 1st sortes part
        int j = mid + 1; // idx for 2nd sorted part
        int k = 0; // idx for temp;

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of 1st sorted part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        //for leftover eleents of 2nd sorted part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for(k = 0, i = si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
}