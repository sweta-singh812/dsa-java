class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int total = totalSum(cardPoints);
        int windowSize = cardPoints.length - k;


        if (windowSize == 0) {
            return total;
        } 



        int minwindow = minwindowSum(cardPoints, windowSize);

        return total - minwindow;       
    }


    static int totalSum(int[] arr) {

        int sum = 0;

        for(int num: arr){

            sum +=num;
        }

        return sum;
    }


    static int minwindowSum(int[] arr, int windowSize){

        int sum =0; 

        for(int i=0 ; i< windowSize; i++){

            sum += arr[i];
        }


        int minSum = sum;

        for(int i = windowSize; i<arr.length ; i++){

            sum = sum + arr[i] - arr[i - windowSize];

            if(sum<minSum) {

                minSum = sum;
            }
        }

        return minSum;
    }
}