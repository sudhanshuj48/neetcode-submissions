class Solution {
    public boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
       boolean a=false;
       for(int i=1 ; i < nums.length ; i++){
        if(nums[i-1]==nums[i]){
            a= true;
            break;
        }
        else{
            a= false;
        }
       } 
       return a ;
    }
}