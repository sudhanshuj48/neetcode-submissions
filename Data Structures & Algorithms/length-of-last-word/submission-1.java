class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length();

        // Remove all trailing spaces
        while (n > 0 && s.charAt(n - 1) == ' ') {
            n--;
        }

        // Count last word
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }
}