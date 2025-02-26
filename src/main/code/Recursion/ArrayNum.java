/* printing an array using recurison */
public class ArrayNum {
    
    public static void recnum(String a[],int index) {
        if(index<a.length) {
            System.out.println(a[index]);
            recnum(a, index+1);
        }
        
    }

    public static int digitcount(int n) {
        if(n==0) {
            return 0;
        }
        else {
            return digitcount((int)n/10)+1;
            /* Every time num is assigned with 1 decimal with increment of 1 */
        }
        
    }
    public static void main(String args[]) {
        String[] Namelist = {"Sanjay","Sushma","Diwakar","Suhas","Anjali"};
        recnum(Namelist, 0);
        System.out.println(digitcount(5678678));
        
    }
    
}
