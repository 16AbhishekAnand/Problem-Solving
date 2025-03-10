public class DiagonalSum {
    public static void calculateDiagonalSums(int[][] matrix) {
        int leftToRight = 0;
        int rightToLeft = 0;
        int n = matrix.length; // give length of row.

        for (int i = 0; i < n; i++) {
            leftToRight += matrix[i][i];
            rightToLeft += matrix[i][n - 1 - i];
        }

        System.out.println("Primary Diagonal Sum: " + leftToRight);
        System.out.println("Secondary Diagonal Sum: " + rightToLeft);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43}
        };

        calculateDiagonalSums(matrix);
    }
}
