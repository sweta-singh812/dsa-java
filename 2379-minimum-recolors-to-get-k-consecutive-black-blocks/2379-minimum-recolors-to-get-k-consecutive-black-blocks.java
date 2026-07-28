class Solution {
    public int minimumRecolors(String blocks, int k) {
        

        int min = Integer.MAX_VALUE;
        int wCount = 0;
        for (int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W'){
                wCount++;
            }
        }

        min = wCount;

        for(int i = 0; i< blocks.length() - k; i++) {

            if(blocks.charAt(i)== 'W'){
                wCount--;
            }

            if(blocks.charAt(i+k) == 'W') {
                wCount++;
            }

            min = Math.min(min , wCount);
        }

        return min;
    }
}