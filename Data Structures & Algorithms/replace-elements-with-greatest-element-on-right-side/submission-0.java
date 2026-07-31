class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            int newMax = Math.max(max, arr[i]);
            arr[i] = max;
            max = newMax;
        }
        return arr;
    }
}