class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum =0; 
        for(int i =0; i< k ; i++){
            sum += nums[i];

        }
        int maxSum =sum;
     // start sliding the window 
        int startIndex = 0; 
        int endIndex = k;

        while(endIndex< nums.length){
            sum -= nums[startIndex];
            startIndex++; // remove previous element

            sum += nums[endIndex];
            endIndex++; // add new element

            maxSum = Math.max(maxSum, sum);
        }

    //Return the average
        return (double) maxSum/k;
    }
}