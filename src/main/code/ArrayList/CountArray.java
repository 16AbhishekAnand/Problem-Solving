//import java.util.ArrayList;

public class CountArray {   
    
    /* Given an array of positive numbers, the task is to find the number of possible contiguous 
    subarrays having product less than a given number k. */
    
    public static int productarry(int a[],int n, int k) {
        int count = 0;
        if(k<=1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= a[j];
                if (prod < k) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int a[] = {1, 9, 2, 10, 6, 4, 3};
        int k = 10;
        int n = a.length;
        System.out.println(productarry(a, n, k));
    }
}

