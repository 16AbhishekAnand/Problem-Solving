public class KadaneAlgo {
    /* Given array of size n.Find sum of contineous subarray with largest sum.
    It is called Kadane's Algorithm's.
     */

    public static int maxSum(int arr[]) {
        int sum = 0; int size = arr.length;
        int res = Integer.MIN_VALUE;

        for(int i=0; i<size; i++) {
            sum = sum + arr[i];
            if(sum < 0) {
                sum = 0;
            }
            if(res < sum) {
                res = sum;
            }
        }
        return res;
    }
    public static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here =0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String args[]) {
        int a[] = {-1 ,-2 ,-3 ,5};
        System.out.println(maxSum(a));

    }
}
