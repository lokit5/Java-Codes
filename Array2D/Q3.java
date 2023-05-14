package Array2D;

public class Q3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,9},{11,4,3}};
        transpose(matrix);
    }
    public static void transpose(int[][] matrix) {
        System.out.println("Transposed Matrix");
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
