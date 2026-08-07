class Solution {

    List<List<String>> result = new ArrayList<>();

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public void solve(String s, int idx, List<String> ans) {

        // Base condition
        if (idx == s.length()) {
            result.add(new ArrayList<>(ans));
            return;
        }

        // Try every possible substring
        for (int i = idx; i < s.length(); i++) {

            String sub = s.substring(idx, i + 1);

            // Only choose palindrome substring
            if (isPalindrome(sub)) {

                // Choose
                ans.add(sub);

                // Explore
                solve(s, i + 1, ans);

                // Backtrack
                ans.remove(ans.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {

        List<String> ans = new ArrayList<>();

        solve(s, 0, ans);

        return result;
    }
}