package Recursion;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        printOccurence(arr,0,2);
    }
    public static void printOccurence(int[] arr, int i, int key) {
        // base
        if(i == arr.length) {
            return;
        }
        //kaam
        if(arr[i] == key ) {
            System.out.print(i + " ");
        }
        printOccurence(arr, i+1,key);
    }
}
