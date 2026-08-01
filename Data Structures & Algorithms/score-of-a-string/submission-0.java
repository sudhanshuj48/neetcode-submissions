class Solution {
    public int scoreOfString(String s) {
        int arr[] = new int[s.length()];

        for(int i=0 ; i<s.length() ; i++){
            arr[i] = (int)s.charAt(i);
        } 
        int diff[] = new int[arr.length - 1];
        for(int j = 0 ; j<arr.length - 1 ; j++){
            diff[j] = Math.abs(arr[j] - arr[j+1]);
        }
        int sum =0 ;
        for(int k =0 ; k<diff.length ; k++ ){
            sum = sum + diff[k];
        }
        return sum ;
    }
}