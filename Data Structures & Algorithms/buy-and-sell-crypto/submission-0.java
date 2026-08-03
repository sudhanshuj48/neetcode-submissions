class Solution {
    public int maxProfit(int[] prices) {
      int maxi = Integer.MIN_VALUE;
      int i=0 ;
      int j= i ;
      while(i<prices.length){
        if(j == prices.length ){
            i++;
            j=i;
            continue;
        }
        maxi = Math.max(maxi , (prices[j] - prices[i]));
        j++;
      } 
      return maxi; 
    }
}
