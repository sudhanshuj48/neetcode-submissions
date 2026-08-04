class Solution {
    public int minimumRecolors(String blocks, int k) {

        int n = blocks.length();
        int mincount = Integer.MAX_VALUE;

        int i = 0;
        int j = k;

        while (j <= n) {

            int count = 0;

            for (int l = i; l < j; l++) {
                if (blocks.charAt(l) == 'W') {
                    count++;
                }
            }

            mincount = Math.min(mincount, count);

            i++;
            j++;
        }

        return mincount;
    }
}