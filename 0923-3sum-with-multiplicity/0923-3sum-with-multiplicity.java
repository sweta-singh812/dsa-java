class Solution {

    public int threeSumMulti(int[] arr, int target) {

        long MOD = 1000000007;

        long[] count = new long[101];

        for (int num : arr)
            count[num]++;

        long ans = 0;

        for (int i = 0; i <= 100; i++) {

            for (int j = i; j <= 100; j++) {

                int k = target - i - j;

                if (k < 0 || k > 100)
                    continue;

                if (k < j)
                    continue;

                if (i == j && j == k) {

                    ans += count[i] * (count[i] - 1) * (count[i] - 2) / 6;

                } else if (i == j) {

                    ans += (count[i] * (count[i] - 1) / 2) * count[k];

                } else if (j == k) {

                    ans += count[i] * (count[j] * (count[j] - 1) / 2);

                } else {

                    ans += count[i] * count[j] * count[k];
                }

                ans %= MOD;
            }
        }

        return (int) ans;
    }
}