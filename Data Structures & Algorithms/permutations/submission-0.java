class Solution {
    List<List<Integer>> result = new ArrayList<>();


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


   public void solve(int idx ,int[] nums)
   {

    // base case
     if (idx == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) current.add(num);
            result.add(current);
            return;
        }

    for(int i=idx ; i< nums.length ; i++)
    {

        swap(nums , idx , i);
        solve(idx+1 , nums);
        
        swap(nums , idx  , i );
      
    }
   }
    public List<List<Integer>> permute(int[] nums)
     {

     List<Integer> ans = new ArrayList<>();
     solve( 0 , nums);
     return result;  
    }
}
