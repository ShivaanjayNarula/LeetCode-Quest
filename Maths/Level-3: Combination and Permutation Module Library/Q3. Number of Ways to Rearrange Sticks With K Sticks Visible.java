class Solution {
    public int rearrangeSticks(int n, int k) {
        Integer[][] dp = new Integer[n + 1][k + 1];
        return helper(n, k, dp);
    }
    private int helper(int n, int k, Integer[][] dp)
    {
        int mod = (int) (1e9 + 7);
        if(n == k)
        {
            return 1;
        }
        if(k == 0)
        {
            return 0;
        }
        if(dp[n][k] != null)
        {
            return dp[n][k];
        }
        long pickTallest = helper(n - 1, k - 1, dp);
        long pickOther = (long) helper(n - 1, k, dp) * (n - 1);
        dp[n][k] = (int) ((pickTallest + pickOther) % mod);
        return dp[n][k];
    }
}
