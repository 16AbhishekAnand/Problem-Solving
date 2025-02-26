public class max {
    
    /* Largest number in array using recursion.*/ 
    
    public static  int maxarr(int a[],int n) {
        if(n==a.length) {
            return a[a.length-1];
        }
        else {
            return maxarr(a, n-1);
        } 
    }
    
    public static void main(String args[]) {
        int a[] = {10,15,20,25,30};
        int b = a.length;
        System.out.println(maxarr(a, b));
    }
}
