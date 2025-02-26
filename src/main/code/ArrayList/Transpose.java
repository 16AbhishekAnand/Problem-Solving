public class Transpose {
    /* Transpose of matrix */

    public static void matrix(int n,int a[][]) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                int temp = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = temp;
            }
        }
        
        for(int x=0;x<n;x++) {
           for(int y=0;y<a[x].length;y++) {
            System.out.print(a[x][y]+" ");
           }
           //System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int mat[][] =   {{1, 1, 1, 1},
                        {2, 2, 2, 2},
                        {3, 3, 3, 3},
                        {4, 4, 4, 4}};
    
        matrix(n,mat);
    }

    
}
