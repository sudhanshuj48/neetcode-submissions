public class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int t = 0; t < k; t++) {
            int maxIdx = 0;
            for (int i = 1; i < gifts.length; i++) {
                if (gifts[i] > gifts[maxIdx]) {
                    maxIdx = i;
                }
            }
            gifts[maxIdx] = (int) Math.floor(Math.sqrt(gifts[maxIdx]));
        }

        long sum = 0;
        for (int g : gifts) sum += g;
        return sum;
    }
}