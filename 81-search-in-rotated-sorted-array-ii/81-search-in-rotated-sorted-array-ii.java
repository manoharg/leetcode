class Solution {

    public boolean search(int[] nums, int target) {
        // Time complexity : O(n) for cases like 1,1,1,1,1
        if (nums == null || nums.length == 0) return false;
        int l = 0;
        int r = nums.length - 1;

        // search in rotated sorted array with distinct values
        while (l <= r) {
            while(l<r && nums[l]==nums[r]) l++;
            
            int m = l + (r - l) / 2;
            if (nums[m] == target) return true;

            // [1,2,1,1,1]
            //while (l < m && nums[l] == nums[m]) l++;

            //while (m < r && nums[m] == nums[r]) r--;

            // [1,2,1,1,1]  -> left part is not sorted but as per my logic it says that its sorted
            // which is wrong.
            //left part is sorted
            if (nums[l] <= nums[m]) {
                if (target >= nums[l] && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                //right part is sorted
                if (target > nums[m] && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }

        return false;
    }
}
