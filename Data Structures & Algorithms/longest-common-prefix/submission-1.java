class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean match = true;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match == true) {
                ans.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return ans.toString();
    }
}