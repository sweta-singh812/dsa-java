import java.util.*;

class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] window = new int[26];

        buildFrequency(p, pFreq);
        buildFirstWindow(s, p.length(), window);

        if (isSame(pFreq, window)) {
            ans.add(0);
        }

        slideWindow(s, p.length(), pFreq, window, ans);

        return ans;
    }

    // Builds frequency array of p
    static void buildFrequency(String p, int[] freq) {
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }
    }

    // Builds first window frequency
    static void buildFirstWindow(String s, int len, int[] window) {
        for (int i = 0; i < len; i++) {
            window[s.charAt(i) - 'a']++;
        }
    }

    // Slides the window
    static void slideWindow(String s, int len, int[] pFreq,
                            int[] window, List<Integer> ans) {

        for (int right = len; right < s.length(); right++) {

            // Remove left character
            window[s.charAt(right - len) - 'a']--;

            // Add right character
            window[s.charAt(right) - 'a']++;

            if (isSame(pFreq, window)) {
                ans.add(right - len + 1);
            }
        }
    }

    // Compare two frequency arrays
    static boolean isSame(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
}