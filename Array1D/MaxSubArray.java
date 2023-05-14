package Array1D;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
    public static void bruteForce(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ) {
            for(int j = i; j < arr.length; j++) {
                int s = 0;
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k]+ " ");
                    s += arr[k];
                }
                System.out.println("Sum = " +s);
                //System.out.println();
                if(max < s) {
                    max = s;
                }
            }
            System.out.println();
        }
        System.out.println("Max = "+max);
    }

    public static void prefixArray(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++) {

            for(int j = i; j < arr.length; j++ ) {
                currSum = i==0?prefix[j] : prefix[j] - prefix[i -1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }
    public static void kadanes(int[] arr){
         int ms = Integer.MIN_VALUE;
         int cs = 0;

         for(int i = 0; i < arr.length; i++) {
             cs += arr[i];
             if(cs < 0) {
                 cs = 0;
             }
             ms = Math.max(cs,ms);
         }
        System.out.println("Max subarray sum = "+ ms);
    }

}
