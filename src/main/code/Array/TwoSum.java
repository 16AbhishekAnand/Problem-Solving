import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Find No. of pairs for sum.
    // Using hashMap => TC: [O(n)] && SC: [O(n)]
    static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Stores (number, index)

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }
            map.put(nums[i], i); // Store the number and its index
        }
        return new int[]{-1};
    }

    // Using 2-Pointer
    static int[] findTwoSumPointer(int[] nums, int target) {
        Arrays.sort(nums); // Sorting takes O(n log n)
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right}; // Return indices (after sorting, original indices are lost)
            } else if (sum < target) {
                left++; // Increase sum by moving left pointer
            } else {
                right--; // Decrease sum by moving right pointer
            }
        }

        return new int[]{-1, -1}; // No valid pair found
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(array, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
