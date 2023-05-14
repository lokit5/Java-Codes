package Array2D;

public class Q1 {
    public static void main(String[] args) {
        int[][] matrix = {{4,7,8}, {8,8,7}};
        System.out.println(frequency(matrix,7));
    }

    public static int frequency(int[][] matrix, int key) {
        int freq = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0;j < matrix[i].length; j++ ) {
                if(matrix[i][j] == key) {
                    freq++;
                }
            }
        }
        return freq;
    }
}
