class Solution {
    public int longestOnes(int[] nums, int k) {

        int zeroCount =0;
        int start =0;
        int maxOnes = 0;

        for(int right =0; right< nums.length; right++){
            if(nums[right]==0){
                zeroCount++;
            }

            while(zeroCount > k){

                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }

            maxOnes = Math.max(maxOnes, right-start+1);
        }

        return maxOnes;
        
    }
}