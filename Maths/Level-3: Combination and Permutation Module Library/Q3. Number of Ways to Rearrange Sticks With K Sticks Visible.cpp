class Solution {
public:
    int rearrangeSticks(int n, int k) {
        vector<vector<int>> dp(n+1, vector<int>(k+1, -1));
        return helper(n, k, dp);
    }
    int helper(int n, int k, vector<vector<int>> &dp)
    {
        int mod = 1e9 + 7;
        if(n == k)
        {
            return 1;
        }
        if(k == 0)
        {
            return 0;
        }
        if(dp[n][k] != -1)
        {
            return dp[n][k];
        }
        dp[n][k] = (1LL * helper(n-1, k-1, dp) + 1LL * helper(n-1, k, dp) * (n-1)) % mod;
        return dp[n][k];
    }
};
