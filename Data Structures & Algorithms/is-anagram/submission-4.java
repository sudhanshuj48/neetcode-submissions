class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charac = new HashMap<>();
        boolean a = true;

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            charac.put(s.charAt(i), charac.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (charac.containsKey(t.charAt(i)) && charac.get(t.charAt(i)) > 0) {
                charac.put(t.charAt(i), charac.get(t.charAt(i)) - 1);
            } else {
                a = false;
                break;
            }
        }

        return a;
    }
}