package DSAProblems;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
    public static int diagonalSum(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endCol = matrix.length - 1;
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[startRow][startCol];
            if(startRow != endCol)
            sum += matrix[startRow][endCol];
            startCol++;
            startRow++;
            endCol--;

        }
        return sum;
    }
    public static void diagonalSum2() {

    }
}
