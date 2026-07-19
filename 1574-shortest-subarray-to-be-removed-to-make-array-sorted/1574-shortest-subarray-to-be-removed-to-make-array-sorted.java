class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {

        int n = arr.length;

        // Step 1: Find longest sorted prefix
        int left = 0;
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        // If whole array is already sorted
        if (left == n - 1) {
            return 0;
        }

        // Step 2: Find longest sorted suffix
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        // Step 3: Remove either prefix or suffix
        int ans = Math.min(n - left - 1, right);

        // Step 4: Try merging prefix and suffix
        int i = 0;
        int j = right;

        while (i <= left && j < n) {

            if (arr[i] <= arr[j]) {
                ans = Math.min(ans, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return ans;
    }
}