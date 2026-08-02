class Solution {
    public int maximumWealth(int[][] accounts) {
        

        int maxWealth = 0; 
        for(int i = 0 ; i< accounts.length ; i++){
            int wealth = calculateWealth(accounts[i]);

            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }

        return maxWealth;
        
    }


    public static int calculateWealth(int[] pgj){
        int sum = 0;
        for(int i = 0 ; i<pgj.length; i++){
        sum = sum+pgj[i];
        }

    return sum;
    }

}