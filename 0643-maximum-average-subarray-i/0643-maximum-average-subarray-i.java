class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int currentSum = firstWindowSum(nums,k);
        int maxSum = currentSum;


        for(int i =k; i<nums.length; i++){

            currentSum = currentSum + nums[i] - nums[i-k];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return (double) maxSum/k;
        
    }


    static int firstWindowSum(int[] nums, int k){

        int sum = 0 ; 

        for( int i = 0; i<k; i++){

            sum +=nums[i];
        }

        return sum;
    }
}