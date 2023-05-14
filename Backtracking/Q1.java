package Backtracking;

public class Q1 {
    public static boolean isSafe(int[][] grid, int row, int col) {
        if(grid[row][col] == 0) {
            return false;
        }
        return true;
    }
    public static void print(int[][] grid) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean solution(int[][] grid, int row, int col,int n,int m,int[][] sq) {
        //base case
        if(row == n-1 && col == m-1) {
            sq[row][col] = 1;
            return true;
        } else if(row == n || col == m) {
            return false;
        }
        //kaam
        if(isSafe(grid, row, col + 1)){
            sq[row][col] = 1;
            return solution(grid,row,col +1,n,m,sq);
        } else if (isSafe(grid, row + 1, col)){
            sq[row][col] = 1;
            return solution(grid,row + 1 ,col,n,m,sq);
        } else if (isSafe(grid, row - 1, col)){
            sq[row][col] = 1;
            return solution(grid,row - 1 ,col,n,m,sq);
        } else if (isSafe(grid, row , col - 1)){
            sq[row][col] = 1;
            return solution(grid,row ,col - 1,n,m,sq);
        } else {
            sq[row][col] = 0;
            return false;
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1}};
        int[][] sq = {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};
        //System.out.println(solution(grid,0,0,4,4));
        if(solution(grid,0,0,4,4,sq)) {
            print(sq);
        } else {
            System.out.println("path does not exist");
        }
    }
}
