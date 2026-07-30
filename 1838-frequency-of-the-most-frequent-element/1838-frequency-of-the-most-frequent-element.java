import java . util .*;
class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0; 
        long windowSum = 0;
        int ans = 0;

        for(int right = 0; right<nums.length ; right++){

           

            //add new element to the window 
            windowSum += nums[right];

            //shrink the window if more than k operations needed

            while ((long) nums[right] * (right - left + 1) - windowSum > k) { 
                windowSum -= nums[left];
                left++;
            }

            //update the answer

            ans = Math.max(ans, right - left + 1);
            
        }

        return ans;

        
    }
}