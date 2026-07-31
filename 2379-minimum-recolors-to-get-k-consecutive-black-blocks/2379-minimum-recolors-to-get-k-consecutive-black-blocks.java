import java.util.*;

class Solution {
    public int minimumRecolors(String blocks, int k) {

        int wCount = 0;

        // Count white blocks in the first window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                wCount++;
            }
        }

        int min = wCount;

        // Slide the window
        for (int i = 0; i < blocks.length() - k; i++) {

            if (blocks.charAt(i) == 'W') {
                wCount--;
            }

            if (blocks.charAt(i + k) == 'W') {
                wCount++;
            }

            min = Math.min(min, wCount);
        }

        return min;
    }
}