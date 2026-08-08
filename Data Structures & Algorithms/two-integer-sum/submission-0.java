class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i=0 ;
        int j= i+1 ;
        while(i < nums.length){
            if(j== nums.length){
                i++;
                j= i+1;
            }
         else if(nums[i] + nums[j] == target){
            ans[0] = i;
            ans[1] = j ;
            break;
          }
          else{ 
            j++;
          }
          
          
        }
        return ans ;
    }
}
