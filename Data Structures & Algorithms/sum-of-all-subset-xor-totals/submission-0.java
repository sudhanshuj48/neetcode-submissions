class Solution {
    private int total = 0;

    public int subsetXORSum(int[] nums) {
        solve(nums, 0, 0);
        return total;
    }

    private void solve(int[] nums, int i, int currXor) {
        if (i == nums.length) {
            total += currXor;
            return;
        }
        // include nums[i]
        solve(nums, i + 1, currXor ^ nums[i]);
        // exclude nums[i]
        solve(nums, i + 1, currXor);
    }
}