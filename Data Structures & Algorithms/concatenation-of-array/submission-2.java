class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = 2*nums.length; 
        int [] ans = new int[m];
        int i=0;
        int k=0;
       while( i<m){
        if(k==nums.length){
          k=0;
        }
        ans[i] = nums[k];
        k++;
        i++;
       }
        return ans;
            
        
    }
}