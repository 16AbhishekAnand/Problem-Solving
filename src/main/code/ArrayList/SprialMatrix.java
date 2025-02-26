import java.util.ArrayList;

public class SprialMatrix {
    
    /* Traverse the matrix in the sprial manner. 
    SPRIAL MATRIX = {{1  2  3  4},
                    {5  6  7  8},
                    {9  10 11 12},
                    {13 14 15 16}}
    
    Tranverse order:- 1->2->3->4->8->12->16->15->14->13->9->5->->6->7->11->10 */
    
    public static ArrayList <Integer>sprialTraverse(int n,int a[][],int key) {
        
        ArrayList <Integer> arrlist = new ArrayList <Integer>();
        
        int pos1,pos2;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if(a[i][j]==key) {
                    pos1=i;
                    pos2=j;
                }
            }
        }

        int startrow = 0; int endrow = n-1;
        int startcoloumn = 0; int endcoloumn = n-1;
         
         for(int temp=0;temp<=endcoloumn*endrow;temp++) { // traversing to whole size of array.
            
            // Traverse to right.
            
            for(int i=startcoloumn;i<=endcoloumn;i++) {
                arrlist.add(a[startrow][i]);
            }
            startrow++;
            
            // Tranverse to down.

            for(int j=startrow;j<=endrow;j++) {
                arrlist.add(a[j][endcoloumn]);
            }
            endcoloumn--;

            // Traverse to left.

            for(int k=endcoloumn;k>=startcoloumn;k--) {
                arrlist.add(a[endrow][k]);
            }
            endrow--;

            // Traverse to up. 

            for(int x=endrow;x>=startrow;x--) {
                arrlist.add(a[x][startcoloumn]);
            }
            startcoloumn++;
        }
        return arrlist;
        
    }

    

    

    



    public static void main(String args[]) {
        int n = 4, m = 4, k = 10;
        int a[][] = {{1 , 2 , 3 , 4},
                    {5  ,6  ,7 , 8},
                    {9 , 10 ,11, 12},
                    {13 ,14 ,15, 16}};
        
        System.out.println(sprialTraverse(n,a, k));
        
    }



}
