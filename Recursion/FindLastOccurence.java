package Recursion;

public class FindLastOccurence {
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr, arr.length - 1 , 5));
    }
    public static int lastOccurence(int[] arr, int i, int key) {
        if(i ==  -1) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return lastOccurence(arr,i-1,key);
    }
}
