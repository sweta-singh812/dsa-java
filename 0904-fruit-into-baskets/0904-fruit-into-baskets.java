import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;


        for(int right = 0; right < fruits.length; right++){

            //Fruits enetrs the window 

            map.put(fruits[right], 
            map.getOrDefault(fruits[right], 0) +1);

            //Too many fruit types... we will shrink the window

            while(map.size() > 2) {

                //Decrese the frequency 

                map.put(fruits[left], map.get(fruits[left]) -1);

                //remove the element as the frequency is 0

                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }

                left++;
            }

            //update the longest valid window

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        
    }
}