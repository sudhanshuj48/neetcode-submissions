class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public void solve(List<Integer> ans, int[] candidates, int target, int idx) {
        if (target == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }
        if (idx == candidates.length || target < 0) return;

        // Include candidates[idx]
        ans.add(candidates[idx]);
        solve(ans, candidates, target - candidates[idx], idx + 1);
        ans.remove(ans.size() - 1);

        // Exclude candidates[idx] — skip all duplicates of it
        while (idx + 1 < candidates.length && candidates[idx + 1] == candidates[idx]) {
            idx++;
        }
        solve(ans, candidates, target, idx + 1);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        solve(ans, candidates, target, 0);
        return result;
    }
}