class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }

    void helper(int[] arr, int ind, int sum, List<List<Integer>> ans, List<Integer> temp) {
        if (sum == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > sum) break;
            temp.add(arr[i]);
            helper(arr, i + 1, sum - arr[i], ans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
