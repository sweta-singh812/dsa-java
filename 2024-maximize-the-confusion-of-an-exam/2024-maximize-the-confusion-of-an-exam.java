import java.util.*;

class Solution {

    public int maxConsecutiveAnswers(String answerKey, int k) {

        int changeF = findMax(answerKey, k, 'F');
        int changeT = findMax(answerKey, k, 'T');

        return Math.max(changeF, changeT);
    }

    private int findMax(String answerKey, int k, char changeChar) {

        int left = 0;
        int changeCount = 0;
        int maxLength = 0;

        for (int right = 0; right < answerKey.length(); right++) {

            // New character enters the window
            if (answerKey.charAt(right) == changeChar) {
                changeCount++;
            }

            // More than k changes needed -> shrink
            while (changeCount > k) {

                if (answerKey.charAt(left) == changeChar) {
                    changeCount--;
                }

                left++;
            }

            // Update longest valid window
            maxLength = Math.max(maxLength,right - left + 1);
               
        }

        return maxLength;
    }
}