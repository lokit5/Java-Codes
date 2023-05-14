package GreedyAlgorithm;

public class Q2 {
    public static int kthLargestOddInRange(int L, int R, int k) {

        for(int i = R; i >= L; i--) {
            if(i % 2 != 0) {
                k--;
            }
            if(k == 0) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int L = -3, R = 3;
        int k = 2;
        System.out.println(kthLargestOddInRange(L,R,k));
    }
}
