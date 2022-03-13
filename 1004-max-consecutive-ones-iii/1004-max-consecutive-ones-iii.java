class Solution {

    public int longestOnes(int[] nums, int k) {
        if (nums == null) return 0;
        int i = 0, j = 0, l = nums.length;
        int ones = 0;
        int ans = Integer.MIN_VALUE;

        while (j < l) {
            if (nums[j] == 1) ones++;
            if ((j - i + 1) - ones <= k) {
                ans = Math.max(ans, j - i + 1);
                //System.out.println("candidate " + i + " " + j);
            } else if ((j - i + 1) - ones > k) {
               // System.out.println("shrink " + i + " " + j);
                while ((j - i + 1) - ones > k) {
                    // System.out.println("shrink " + i + " " + j);
                    if (nums[i] == 1) ones--;
                    i++;
                }
            }
            j++;
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}
