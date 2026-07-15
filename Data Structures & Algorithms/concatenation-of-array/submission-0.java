class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = 2*nums.length; 
        int [] ans = new int[m];
        int k=0;
        for(int i=0 ; i< 2 ; i++){
            for(int j=0 ; j<nums.length ; j++){
                ans[k]=nums[j];
                k++;
            }
        }
        return ans;
            
        
    }
}