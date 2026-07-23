class Solution {
    public int splitArray(int[] nums, int k) {

        int start = maxElement(nums);
        int end = sumArray(nums);

        while(start<=end){

            int mid = start + (end - start) /2; 

            if(CanSplit(nums,k,mid)){

                end = mid - 1;
            }
            else{

                start = mid +1;
            }
        }

        return start;
        
    }


    static int maxElement(int[] nums) {

        int max = nums[0];

        for( int num: nums){

            if(num > max){

                max = num;
            }
            
        }
        return max;
    }


    static int sumArray(int[] nums){

        int sum =0;

        for ( int num: nums){

            sum += num;
        }

        return sum;
    }


    static boolean CanSplit(int[] nums, int k ,int limit) {

        int peices = 1; 
        int currentSum=0;

        for (int num : nums){

            if(currentSum + num >limit ){

                peices++;
                currentSum = num;
            }

            else{

                currentSum +=num;
            }
        }

        return peices <= k;
    }

    
}