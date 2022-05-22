class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        long sum = 0;
        int ans = Integer.MAX_VALUE;
        while (j < nums.length) {
            if (sum < target) {
                sum += nums[j];
            }
            while (sum >= target) {
               // System.out.println("j " + j + " i" + i);
                ans = Math.min(ans, j - i + 1);
                sum = sum - nums[i];
                i++;
            }

            j++;
        }

        return ans == Integer.MAX_VALUE ? 0: ans;
    }
}
