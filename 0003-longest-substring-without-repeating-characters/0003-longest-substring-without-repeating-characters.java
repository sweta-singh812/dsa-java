class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();


        int left =0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {

            left = removeDuplicates(s,set,left,right);

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left +1);
        }
        
        return maxLength;
    }

    static int removeDuplicates(String s, HashSet<Character> set , int left , int right) {

        while(set.contains(s.charAt(right))) {

            set.remove(s.charAt(left));
            left++;
        }


        return left;
    }
}