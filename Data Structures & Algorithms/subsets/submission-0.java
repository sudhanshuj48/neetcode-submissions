class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void hello (int idx , List<Integer> ans , int[] nums){
    if(idx == nums.length ){
        result.add(new ArrayList<>(ans));
        return;
    }
    ans.add(nums[idx]);
    hello(idx+1 , ans , nums);
    ans.remove(ans.size() - 1);
    hello(idx+1 , ans , nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        hello(0 , new ArrayList<>() , nums);
        return result;
    }
}