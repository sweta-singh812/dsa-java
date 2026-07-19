class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {

        int i = 0;
        int j = plants.length - 1;

        int alice = capacityA;
        int bob = capacityB;

        int refill = 0; 

        while(i<j) {

            if (alice < plants[i]) {
                refill++;
                alice = capacityA;
            }

            alice -= plants[i];

            if(bob <plants[j]) {
                refill++;
                bob = capacityB;
            }

            bob -= plants[j];


            i++;
            j--;
        }

        if(i == j) {
            
            if(Math.max(alice,bob) < plants[i]) {
                refill++;
            }
        }


        return refill;
        
        
    }
}