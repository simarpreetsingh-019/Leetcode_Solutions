class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs_DP(n, memo);  //climb_Stairs(0, n, memo);
    }
    public int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
    
    public static int climb_Stairs_DP(int N, int[] dp) {
      for (int n = 0; n <= N; n++) {
          if (n <= 1) {
              dp[n] = 1;
              continue;
          }

          int ans = dp[n - 1] + dp[n - 2];// fibo_memo(n - 1, dp) + fibo_memo(n - 2, dp);
          dp[n] = ans;
      }

      return dp[N];
  }
    
}