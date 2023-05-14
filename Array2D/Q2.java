package Array2D;

public class Q2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumRow(matrix, 2));
    }

    public static int sumRow(int[][]matrix, int row) {
        int sum = 0;
        for(int j = 0; j < matrix[0].length; j++) {
            sum += matrix[row - 1][j];
        }
        return sum;
    }
}
