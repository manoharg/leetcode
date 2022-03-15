class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int targetDiff = target - nums[i] - nums[j] - nums[k];

                if (targetDiff == 0) return target - targetDiff;

                if (Math.abs(targetDiff) < Math.abs(ans)) {
                    ans = targetDiff; // store the smallest diff
                } else if (targetDiff > 0) { // we need bigger nums
                    j++;
                } else k--;
            }
        }

        return target - ans;
    }
}
