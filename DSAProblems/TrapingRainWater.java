package DSAProblems;

public class TrapingRainWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
    public static int trappedRainWater(int[] height){
        //calculate left max boundary - array
        int[] leftmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i < height.length; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary - array
        int[] rightmax = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for(int i=height.length - 2; i >= 0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i = 0; i < height.length; i++){
            //waterlevel = min(leftmax,rightmax)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            //trapped water = (water level - bar level) * width
            trappedWater += waterlevel - height[i];
        }


        return trappedWater;
    }
}
