package DSAProblems;

public class Tilling {
    public static void main(String[] args)  {
        System.out.println(tilingProblem(4));
    }
    public static int tilingProblem(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        return fnm1 + fnm2;
    }

}
