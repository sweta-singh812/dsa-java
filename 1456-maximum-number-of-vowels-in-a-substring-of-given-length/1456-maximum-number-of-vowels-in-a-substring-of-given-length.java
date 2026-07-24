class Solution {
    public int maxVowels(String s, int k) {

        int current  = firstWindowLetters(s,k);
        int maxVowels= current;

        for (int i= k; i<s.length() ; i++){
             if (isVowel(s.charAt(i))) {
                current++;
            }

            if (isVowel(s.charAt(i - k))) {
                current--;
            }

            if (current > maxVowels) {
                maxVowels = current;
            }
            
        }

        return maxVowels;
        
    }

    static int firstWindowLetters(String s, int k){

        int count = 0;


        for (int i = 0; i < k; i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    static boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}