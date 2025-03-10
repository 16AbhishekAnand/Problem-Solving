import java.util.Arrays;

public class MajorityElement {
    /* Find the majority element from the list.
     * majority element = element count > n/2.
     */

    public static int majele(int arr[],int n) {

        for(int i=0; i<n; i++) {
            int count = 1;
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > n/2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int test (int arr[],int n) {
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            int count =1;
            if(arr[i] == arr[i+1]) {
                count++;
            }
            if(count >= n/2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] ={3,1,3,3,2}; // 1,2,3,3,3
        int n = arr.length;
        //System.out.println(n/2);
        System.out.println(test(arr, n));
    }
}
