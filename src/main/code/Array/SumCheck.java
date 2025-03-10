import java.util.ArrayList;

public class SumCheck {

    // NOTE: Sliding Window (Fixed Sum Subarray)
    // Problem: Find a contiguous subarray that sums to S.
    // suitable when for +ve value.

    // Kadane’s Algorithm (Maximum Sum Subarray)
    // Problem: Find a contiguous subarray with the maximum sum.
    // Used when we need to maximize the sum, and values may be negative.
    static ArrayList<Integer> subarrSum(int arr[], int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) { // Sliding Window Technique
            sum += arr[right];

            // Shrink the window from the left if sum exceeds 's'
            while (sum > s && left < right) {
                sum -= arr[left];
                left++;
            }

            // If sum matches 's', return indices (1-based)
            if (sum == s) {
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }
        }

        // If no subarray is found, return -1
        result.add(-1);
        return result;
    }

    public static void main(String args[]) {
        int[] array = {1, 2, 3, 7, 5};
        int s = 12; // Change sum value for testing
        System.out.println(subarrSum(array, array.length, s));
    }
}
