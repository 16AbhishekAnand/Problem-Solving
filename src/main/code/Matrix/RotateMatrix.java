public class RotateMatrix {
        public static void transpose(int[][] matrix, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) { // Only columns after the diagonal; i=0 & j = 1;
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        public static void rotate(int[][] matrix, int n) {
            // Step 1: Transpose the matrix
            transpose(matrix, n);

            // Step 2: Reverse each row to get the rotated matrix
            for (int i = 0; i < n; i++) {
                int left = 0, right = n - 1;
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }

            // Print rotated matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };
            rotate(matrix, matrix.length);
        }
    }
}
