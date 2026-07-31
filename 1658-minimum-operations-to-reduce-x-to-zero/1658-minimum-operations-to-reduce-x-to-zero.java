import java.util.*;

class Solution {
    public int minOperations(int[] nums, int x) {

        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Sum that we need to keep
        int target = totalSum - x;

        if (target < 0) {
            return -1;
        }

        int left = 0;
        int currentSum = 0;
        int maxLength = -1;

        for (int right = 0; right < nums.length; right++) {

            // New element enters
            currentSum += nums[right];

            // Shrink if sum becomes greater than target
            while (left <= right && currentSum > target) {
                currentSum -= nums[left];
                left++;
            }

            // Found a subarray with required sum
            if (currentSum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        // No valid subarray found
        if (maxLength == -1) {
            return -1;
        }

        // Remove everything except the longest kept subarray
        return nums.length - maxLength;
    }
}