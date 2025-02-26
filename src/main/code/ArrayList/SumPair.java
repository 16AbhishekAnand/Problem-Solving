import java.util.HashMap;

public class SumPair {
    /* Find the no. of pairs which gives sum given. */

    public static int countpair(int arr[],int n,int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(k - arr[i])) {
                count += hm.get(k - arr[i]);
            }
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        return count;
        
    }

    public static void main(String args[]) {
        int arr [] = {1,5,2,1};
        int n = arr.length;
        int key = 6;
        System.out.println(countpair(arr, n, key));
    }
}
