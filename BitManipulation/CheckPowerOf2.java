package BitManipulation;

public class CheckPowerOf2 {
    public static void main(String args[]) {
        System.out.println(isPowerof2(3));
    }
    public static boolean isPowerof2(int n) {
        return  (n & (n-1)) == 0;
    }


}
