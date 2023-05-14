package Recursion;

public class PrintXToThePowerN {
    public static void main(String[] args) {
        //System.out.println(power(2,4));
        System.out.println(optimisedPower(2,5));
    }
    public static int power(int x, int n) {
        if(n == 1) {
            return x;
        }
        return x*power(x,n-1);
    }
    public static int optimisedPower(int x,int n ) {
        if(n==0) {
            return 1;
        }
        int halfPower = optimisedPower(x,n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if(n % 2 != 0) {
            return x * halfPowerSq;

        }
        return halfPowerSq;
    }

}
