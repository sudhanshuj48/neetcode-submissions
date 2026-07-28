class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true ;
        }
        int i=0;
        int j=0;
        boolean a = false;
        while(i< t.length() ){
          if(s.charAt(j) == t.charAt(i)){
            
            i++;
            j++;
             if(j == s.length()){
            a= true;
            break;
        }
        
          }
          else{
            i++;
          }
        }
        return a ;
        
    }
}