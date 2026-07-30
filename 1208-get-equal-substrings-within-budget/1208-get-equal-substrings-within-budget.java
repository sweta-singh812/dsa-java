import java.util.*;
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        

        int left = 0; 
        int currentCost = 0; 
        int maxLength = 0;

        for ( int right = 0; right <s.length(); right++){

            //add the cost to the new character
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));


            //shrink the window as cost it exceeds the budget

            while(currentCost > maxCost){
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            //update the answer

            maxLength = Math.max(maxLength , right - left +1);



            
        }

        return maxLength;
    }
}