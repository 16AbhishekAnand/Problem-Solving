public class Transpose {
    public static void transposeMatrix(int n, int[][] matrix) {
        // Transpose Matrix

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Only columns after the diagonal; i=0 & j = 1;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Print transposed matrix row-wise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 4;
        int[][] mat = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        transposeMatrix(n, mat);
    }
}
