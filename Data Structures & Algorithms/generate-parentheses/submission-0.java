class Solution {
    List<String> result = new ArrayList<>();

    public boolean isValid(List<String> ans) {
        int count = 0;
        boolean a = true;
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i).equals("(")) {
                count++;
            } else {
                count--;
                if (count < 0) {
                    a= false;
                    return a;
                }
            }
        }
        if(count != 0 ){
            a=false;
        }
        return a;
    }

    public void solve(List<String> ans, int idx, int n) {
        if (ans.size() == 2 * n) {
            if (isValid(ans)) {
                result.add(String.join("", ans));
            }
            return;
        }

        ans.add("(");
        solve(ans, idx + 1, n);
        ans.remove(ans.size() - 1);

        ans.add(")");
        solve(ans, idx + 1, n);
        ans.remove(ans.size() - 1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, 0, n);
        return result;
    }
}