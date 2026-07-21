class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void solve(int idx , List<Integer> ans ,int[] nums , int target ){
        if (target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if (idx == nums.length || target < 0) {
            return;
        }
        ans.add(nums[idx]);
        solve(idx , ans , nums , target - nums[idx]);
        
        ans.remove(ans.size() - 1);
        solve(idx + 1 , ans , nums , target);
    } 
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        solve(0 , ans , nums , target);
        return result;
    }
}