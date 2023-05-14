package Array1D;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        for(int i = 0; i <= arr.length/2-1; i++ ) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
