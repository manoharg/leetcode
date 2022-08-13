class Solution {

    public int lengthOfLIS(int[] a) {
        int n = a.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            int ans = 1;
            for (int j = i; j >= 0; j--) {
                if (a[j] < a[i]) {
                    ans = Math.max(ans, 1 + dp[j]);
                }
            }
            dp[i] = ans;
        }
       // System.out.println(Arrays.toString(dp));

        int ans = Integer.MIN_VALUE;
        for (int i : dp) ans = Math.max(ans, i);
        return ans;
    }
}


//[10,9,2,5,3,7,101,18]

