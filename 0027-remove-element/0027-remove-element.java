class Solution {
    public int removeElement(int[] nums, int val) {
        return r(nums,val);
        
    }static int r(int[] nums , int val ){

        int index = 0;

        for(int i =0; i< nums.length; i++){

            if(isValid (nums[i] , val)){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
    static boolean isValid(int nums, int val){

        return nums != val;
    }
}