package Array1D;

public class pairs {
    public static void main(String[] args) {
        int[] arr = {10,1,32,43,3};
        pairs(arr);
    }
    public static void pairs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ","+ arr[j] + ") ");
            }
        }
    }
}
