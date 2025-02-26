
public class MissingNum {
    /* Find the missing number in the array. */
    
    public static int arrnum(int a[],int n) {
        int nSum = (n*(n+1))/2;
        System.out.println("N  sum = "+nSum);
        int sum = 0; 
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        System.out.println("array sum " +sum);
       int missnum = nSum-sum;
       return missnum;
    }

    
    public static void main(String args[]) {
        int a[] = {6,1,2,8,3,4,7,9,5};
        int n = 10;
        System.out.println(arrnum(a, n));
    }
}

