import java.util.*;

class Solution {

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // A new element enters the window
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If window becomes invalid, shrink it
            while (zeroCount > k) {

                // If a zero leaves the window,
                // decrease zeroCount
                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Window is valid, update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}