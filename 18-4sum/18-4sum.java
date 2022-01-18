 class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();

            if (nums == null || nums.length < 4) {return ans;}
            int l = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < l; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {continue;}
                for (int j = i+1; j < l; j++) {
                    if (j > i+1 && nums[j] == nums[j - 1]) {continue;}

                    int m = j + 1;
                    int n = l - 1;
                    while (m < n) {
                        int sum = nums[i] + nums[j] + nums[m] + nums[n];

                        if (sum == target) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                            m++;
                            n--;
                          //  System.out.println("i "+ i + "j "+ j + "m "+ m + "n "+n);
                            while (m < n && nums[m] == nums[m - 1]) {m++;}
                          //  while (m<n  && nums[n] == nums[n + 1]) {n--;}

                        } else if (sum < target) {
                            m++;
                        } else {
                            n--;
                        }

                    }

                }
            }
            return ans;
        }
    }