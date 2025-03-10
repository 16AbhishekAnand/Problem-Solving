import java.util.Arrays;

public class MissingNum {
    /* Find the missing number in the array. */

    public static int arrNum(int a[],int n) {
        int nSum = (n*(n+1))/2; // formula of sum of n different  number.
        System.out.println("N  sum = "+nSum);
        int sum = 0;
        for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        System.out.println("array sum " +sum);
        int missNum = nSum-sum;
        return missNum;
    }

    public static int missNum(int arr[], int n) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i <= n; i++) { // computes the XOR of all numbers from 0 to n.
            xor1 ^= i;
        }
        for (int num : arr) {
            xor2 ^= num;  // XOR of all numbers in the array
        }

        return xor1 ^ xor2;  // Missing number
        /*  x ^ x = 0 (Any number XOR itself is 0)
            x ^ 0 = x (Any number XOR 0 remains unchanged)
        */
    }

    public static void main(String args[]) {
        int a[] = {6,1,2,8,3,4,7,9,5};
        int n = 10;
        System.out.println(arrNum(a, n));
    }
}
