package DSAProblems;

public class SearchIn2DArrayStaircase {
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key = 33;
        System.out.println(staircaseSearch2(matrix,key));

    }
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix.length -1;

        while(row < matrix.length && col >= 0 ) {
            if(matrix[row][col] == key) {
                System.out.println("found key at (" + row + ","+col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
    public static boolean staircaseSearch2(int[][] matrix, int key) {
        int row = matrix[0].length - 1, col = 0;

        while(row >= 0 && col < matrix.length ) {
            if(matrix[row][col] == key) {
                System.out.println("found key at (" + row + ","+col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                row--;
            } else{
                col++;
            }
        }
        return false;
    }
}
