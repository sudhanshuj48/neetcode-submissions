class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public void solve( List<Integer> ans , int idx, int n , int k  ){
       //base case
       if (ans.size() == k) {
            result.add(new ArrayList<>(ans));
            return;
        }
        if (idx > n) {
            return;
        }
        
       ans.add(idx);
       solve(ans , idx+1 , n , k );

       ans.remove(ans.size()-1);
       solve(ans, idx+1 , n , k);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        solve(ans , 1 , n , k );
        return result;
        
    }
}