class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] cnt = new int[101]; 
        int res = 0;
        for (int n : nums) cnt[n]++;
        for (int i = k + 1; i < 101; i++) // for (int i = 0; i < 101-k; ++i)
            res += cnt[i] * cnt[i - k];   //    res += cnt[i] * cnt[i + k];
        return res;
    }
}