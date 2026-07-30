class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // Build frequency map of s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            char ch = s2.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (right - left + 1 > s1.length()) {

                char leftChar = s2.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }

                left++;
            }

            if (map1.equals(windowMap)) {
                return true;
            }
        }

        return false;
    }
}