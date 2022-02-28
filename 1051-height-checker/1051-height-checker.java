class Solution {
    public int heightChecker(int[] heights) {
        int[] cnt = new int[101];
        for (int h : heights) { 
            cnt[h]++; // 3 1 1 1
        }
        for (int i = 1; i <= 100; i++) { 
            cnt[i] += cnt[i - 1]; // 3 4 5 6
        }
        int ans = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[--cnt[heights[i]]] != heights[i]) 
                ans++;
        }   
        return ans;
    }
}
