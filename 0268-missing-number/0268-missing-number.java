class Solution {
    public int missingNumber(int[] nums) {

        int expectedSum = calculateExpectedSum(nums.length);
        int actualSum = calculateActualSum(nums);

        return expectedSum - actualSum;
        
    }

    public static int calculateExpectedSum(int n){

        return n*(n+1) /2;
    }

    public static int calculateActualSum(int[] nums){

        int sum =0;
        for(int i = 0; i < nums.length; i++){
            sum = sum+ nums[i];
        }

        return sum;
    }
}