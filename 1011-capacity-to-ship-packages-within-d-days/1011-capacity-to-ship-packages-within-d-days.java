class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start = maxWeight(weights);
        int end = totalWeight(weights);

        while(start<=end){

            int mid = start+(end - start)/2;

            if(CanShip(weights,days,mid)){

                end = mid-1;
            }

            else{
                start = mid + 1;
            }
        }

        return start;
        
    }

    static int maxWeight(int[] weights){

        int max = weights[0];

        for (int weight:weights){
            if (weight>max){
                max=weight;
            }
        }

        return max;
        
    }


    static int totalWeight(int[] weights){

        int sum = 0;


        for(int weight: weights){

            sum += weight;
        }

        return sum;
    }


    static boolean CanShip(int [] weights, int days, int capacity){

        int currentWeight = 0;
        int requiredDays= 1;

        for(int weight:weights){

            if(currentWeight + weight > capacity){
               
               
                requiredDays++;
                currentWeight = weight;
            }

            else{

                currentWeight +=weight;
            }
        }

        return requiredDays <= days;

    }
}