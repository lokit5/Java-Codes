package DP;

public class fibonacci {

    public static int fibonacci(int n, int[] f) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(f[n] != 0) {
            return f[n];
        }

        f[n] = fibonacci(n-1,f) + fibonacci(n-2,f);
        return f[n];
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        for(int i = 2; i <= n ; i++) {
            dp[i] = dp[i -1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n+ 1];
        System.out.println(fibonacci(n,f));
        System.out.println(fibTabulation(n));
    }
}
