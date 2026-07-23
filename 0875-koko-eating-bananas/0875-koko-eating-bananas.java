class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = maxPile(piles);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canFinish(piles, h, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Find maximum pile
    static int maxPile(int[] piles) {

        int max = piles[0];

        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        return max;
    }

    // Check if Koko can finish in h hours
    static boolean canFinish(int[] piles, int h, int speed) {

        long hours = 0;

        for (int pile : piles) {

            hours += (pile + speed - 1) / speed;
        }

        return hours <= h;
    }
}