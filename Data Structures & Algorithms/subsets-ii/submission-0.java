class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void solve(int idx , List<Integer> ans , int[] nums){
        //base condition 
        if(result.contains(ans)){
            return;
        }
        if( idx >= nums.length){
          result.add(new ArrayList<>(ans));// copying the path
          return ;
        }

        ans.add(nums[idx]);
        solve(idx+1 , ans , nums);
        ans.remove(ans.size()-1);
        solve(idx+1 , ans , nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        solve(0 , ans , nums );
        return result  ;
    }
}
