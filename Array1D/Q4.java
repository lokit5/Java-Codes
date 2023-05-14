package Array1D;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrapingRainWater(arr));
    }
    public static int TrapingRainWater(int arr[]) {
        int[] leftMax = new int[arr.length ];
        int[] rightMax =  new int[arr.length];
        int trappedWater = 0;

        leftMax[0] = arr[0];
        for(int i = 1; i < arr.length; i++ ) {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        rightMax[rightMax.length -1 ] = arr[arr.length - 1];
        for(int i = rightMax.length - 2 ; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        for(int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - arr[i]);
        }

        return trappedWater;
    }
}
