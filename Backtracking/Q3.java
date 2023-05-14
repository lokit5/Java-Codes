package Backtracking;

public class Q3 {
    static int n = 8;

    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >=0 && x < n && y >= 0 && y < n && sol[x][y] == -1);
    }

    public static void printSolution(int sol[][]) {
        for(int x = 0 ; x < n; x++) {
            for(int y = 0; y < n; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveKT() {
        int sol[][] =  new int[8][8];
        for(int x = 0; x < n; x++ ) {
            for(int y = 0; y < n; y++) {
                sol[x][y] = -1;
            }
        }

        int xMove[] = {2,1,-1,-2,-2,-1,1,2};
        int yMove[] = {1,2,2,1,-1,-2,-2,-1};

        sol[0][0] = 0;

        if(!solveKTUtil(0,0,1,sol,xMove,yMove)) {
            System.out.println("Solution does not exist");
            return false;
        }
        else
            printSolution(sol);
        return true;
    }

    public static boolean solveKTUtil(int x, int y, int movei, int sol[][],int xMove[], int yMove[]) {
        int k, next_x = 0, next_y = 0;
        if(movei == n*n)
            return true;

        for(k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = x + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
                    return true;
                } else
                    sol[next_x][next_y] = -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solveKT();
    }
}
