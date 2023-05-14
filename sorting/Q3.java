package sorting;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        System.out.println(inversionCount(arr));
    }
    public static int inversionCount(int[] arr) {

        //brute force
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
