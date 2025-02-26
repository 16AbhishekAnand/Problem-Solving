public class EqulibriumPoint {
    /* Equilibrium Point in an array is a position such that the sum of elements 
    before it is equal to the sum of elements after it. */

    public static int equisum(int arr[],int n) {
        int sum = 0;
        int check = 0;
        
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        for(int j=0;j<n;j++) {
            sum -= arr[j];
            if(sum == check) {
                return j;
            }
            check+=arr[j];
        }
        return -1;
    }
    public static void main(String args[]) {
        int a[] = {1,3,5,2,2 };
        int n = a.length;
        System.out.println(equisum(a, n));
    }
}
