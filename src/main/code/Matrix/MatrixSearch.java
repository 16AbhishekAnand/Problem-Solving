import java.util.ArrayList;

public class MatrixSearch {

    // same way we can traverse matrix using nested loop.
        public static ArrayList<Integer> findKeyInMatrix(int[][] matrix, int key) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int row = 0; row < matrix.length; row++) { // till row length;
                for (int col = 0; col < matrix[0].length; col++) { // till col length;
                    if (matrix[row][col] == key) {
                        result.add(row);
                        result.add(col);
                        return result;
                    }
                }
            }

            return result; // Return empty list if key is not found
        }

        // without using nested loop. (Single loop)
    public static ArrayList<Integer> findKeyOptimalWay(int[][] matrix, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows * cols; i++) {
            int row = i / cols;
            int col = i % cols;
            if (matrix[row][col] == key) {
                result.add(row);
                result.add(col);
                return result;
            }
        }
        return result;
    }

        public static void main(String[] args) {
            int[][] matrix = {
                    {10, 20, 30, 40, 50},
                    {11, 21, 31, 41, 51},
                    {12, 22, 32, 42, 52},
                    {13, 23, 33, 43, 53}
            };
            int key = 32;

            System.out.println(findKeyInMatrix(matrix, key));
        }
}
