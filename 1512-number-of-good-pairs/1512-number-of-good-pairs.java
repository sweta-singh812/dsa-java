class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        for(int i = 0; i< nums.length; i++){

            count = count + countPairs(nums,i);
        }

        return count;
        
    }static int countPairs(int[] nums , int index){

        int pairCount =0;

        for(int j = index + 1; j< nums.length; j++){
            if(nums[index] == nums[j]){

                pairCount++;
            }
           

            
        }

        return pairCount;
    }
}