class Solution {
    public int[] shuffle(int[] nums, int n) {

        return array(nums);
        
    }static int[] array(int[] nums){
        int[] array = new int[nums.length];
        int k = 0;
        for(int i = 0 ; i< nums.length/2 ; i++){      
            array[k] = nums[i];
            k += 2; 
        }
        int j = 1;
        for(int i = nums.length/2 ; i< nums.length ; i++){      
            array[j] = nums[i];
            j += 2; 
        }

        return array;
    }



}