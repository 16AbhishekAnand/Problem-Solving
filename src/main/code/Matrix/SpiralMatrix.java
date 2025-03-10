import java.util.ArrayList;

public class SpiralMatrix {

    /* Traverse the matrix in the spiral manner.
    SPIRAL MATRIX = {{1  2  3  4},
                    {5  6  7  8},
                    {9  10 11 12},
                    {13 14 15 16}}

    Traverse order:- 1->2->3->4->8->12->16->15->14->13->9->5->->6->7->11->10 */

        public static ArrayList<Integer> spiralTraversal(int n, int a[][], int key) {

            ArrayList <Integer> arrList = new ArrayList <Integer>();


            int startRow = 0; int endRow = n-1;
            int startColumn = 0; int endColumn = n-1;

            for(int temp = 0; temp < endRow * endColumn; temp++) { // traversing to whole size of array.

                // Traverse to right.
                for(int i=startColumn ;i<=endColumn; i++) {
                    arrList.add(a[startRow][i]);
                }
                startRow++;

                // Traverse to down.

                for(int j=startRow; j<=endRow; j++) {
                    arrList.add(a[j][endColumn]);
                }
                endColumn--;

                // Traverse to left.

                for(int k=endColumn; k>=startColumn; k--) {
                    arrList.add(a[endRow][k]);
                }
                endRow--;

                // Traverse to up.

                for(int x=endRow; x>=startRow; x--) {
                    arrList.add(a[x][startColumn]);
                }
                startColumn++;
            }
            return arrList;
        }

        public static void main(String args[]) {
            int n = 4, m = 4, k = 10;
            int a[][] = {{1 , 2 , 3 , 4},
                    {5  ,6  ,7 , 8},
                    {9 , 10 ,11, 12},
                    {13 ,14 ,15, 16}};

            System.out.println(spiralTraversal(n,a, k));

        }
    }

