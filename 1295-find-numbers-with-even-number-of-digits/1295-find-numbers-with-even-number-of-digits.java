class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;

        for(int i = 0; i< nums.length; i++){
            int digit = countDigit(nums[i]);
            if(digit% 2 == 0){
                count++;
            }
            
        }
        return count;
    }

    public static int countDigit(int num){
        int digits =0;

        while(num>0){
            digits++;
            num = num/10;
        }

        return digits;
    }
}