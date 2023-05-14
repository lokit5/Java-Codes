package Array1D;

public class Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        subArrays(arr);
    }
    public static void subArrays(int[] arr){
        //int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ) {
          for(int j = i; j < arr.length; j++) {
              //int s = 0;
              for(int k = i; k <= j; k++) {
                  System.out.print(arr[k]+ " ");
                  //s += arr[k];
              }
              //System.out.println("Sum = " +s);
              System.out.println();
              //if(max < s) {
              //    max = s;
              //}
          }
          System.out.println();
      }
        //System.out.println("Max = "+max);
    }
}
