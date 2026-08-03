class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> ans = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            if (ans.containsKey(nums[i]) && i - ans.get(nums[i]) <= k) {
                return true;
            }
            ans.put(nums[i], i);
        }
        
        return false;
    }
}