class Solution {
    public int largestAltitude(int[] gain) {
        
    

    

        int CurrentAltitude =0;
        int maxAltitude = 0;
        for(int i =0; i< gain.length; i++){

            CurrentAltitude = CurrentAltitude +gain[i];

            if(CurrentAltitude > maxAltitude){
                maxAltitude = CurrentAltitude;

            }
        }


        return maxAltitude;
    }
}