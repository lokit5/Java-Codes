package DP;

import java.util.Arrays;

public class ClimbingStairs {
    //memoization - O(n) | recursion (2^n)
    public static int countWays(int n, int ways[]) {
       if(n == 0) {
           return 1;
       }
       if(n < 0) {
           return 0;
       }
       if(ways[n] != -1) {
           return ways[n];
       }
       ways[n] = countWays(n- 1,ways) + countWays(n-2,ways);
        return ways[n];
    }
    public static int countWaysTabulation(int n) {
        int dp[] = new int[n+ 1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; i++ ) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n= 5; // n = 3 -> 3 & n = 4 -> 5 => 8
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n,ways));
        System.out.println(countWaysTabulation(n));
    }
}
