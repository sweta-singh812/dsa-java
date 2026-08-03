class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i= 0 ; i < nums.length; i++){
            ans[i] = countsmaller(nums, nums[i]);
        }

        return ans;
        
    }

    public  static int countsmaller(int[] nums, int current){

        int c = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] < current){

                c++;
            }
        }

        return c;
    }
}