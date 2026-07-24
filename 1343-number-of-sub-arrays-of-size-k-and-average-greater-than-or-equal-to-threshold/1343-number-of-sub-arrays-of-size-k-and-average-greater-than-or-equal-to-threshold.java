class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {


        int currentSum = firstWindowSum(arr,k);
        int count = 0;

        if (currentSum / k >= threshold) {
            count ++;
        }

        for(int i = k; i<arr.length ;i++) {

            currentSum = currentSum + arr[i] - arr[i-k];


            if(currentSum/k >= threshold){

                count++;
            }
        }

        return count;
        
    }


    static int firstWindowSum(int[] arr, int k){

        int sum = 0;

        for(int i =0; i<k; i++){

            sum += arr[i];
        }
        return sum;
    }
    
}