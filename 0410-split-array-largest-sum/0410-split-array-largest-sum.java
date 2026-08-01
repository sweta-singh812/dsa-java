class Solution {
    public int splitArray(int[] nums, int k) {
        int Llimit = Lmaxi(nums);
        int Hlimit = maxi(nums);
        return mqu(Llimit,Hlimit,nums,k);
    }static int mqu(int left,int right,int[] nums, int k){
        while(left<right){
            int mid = left + (right - left) / 2;
            int pc = 1;
            int sum = 0;
            for(int i = 0;i<nums.length;i++){
                
                if(sum + nums[i] > mid){
                    pc++;
                    sum = nums[i];
                }else{
                    sum+= nums[i];
                }

            }if(pc<=k){
                right = mid;
            }else{
                left = mid+1;
            }
        }return left;
    }
    static int maxi(int[] nums){
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            max += nums[i];
        }return max;

    }
    static int Lmaxi(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }return max;

    }
}