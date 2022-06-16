class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(candidates,0,candidates.length,target, new ArrayList<>(), ret);
        return ret;
    }

    void helper(int[] arr, int i, int n, int target, List<Integer> temp, List<List<Integer>> ret) {
        if (i == n) {
            if (target == 0) {
                ret.add(new ArrayList<>(temp));
            }
            return;
        }

        if (arr[i] <= target) {
            temp.add(arr[i]);
            //target = target - arr[i];
            helper(arr, i, n, target-arr[i], temp, ret);
            temp.remove(temp.size() - 1);
           // target = target + arr[i];
        }
        helper(arr, i + 1, n, target, temp, ret);
    }
}
