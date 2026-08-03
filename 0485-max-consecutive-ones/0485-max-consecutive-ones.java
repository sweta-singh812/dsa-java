class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return countMaxOnes(nums);
    }        
    

    static int countMaxOnes(int[] nums){

        int count =0;
        int max =0;

        for(int i=0; i< nums.length; i++){

            if(nums[i] ==1){
                count++;
                if(count> max){
                    max = count;
                }
            }
            else{
                count =0;
            }
        }
        return max;
    }
}