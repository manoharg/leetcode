class Solution {
    public boolean isPanlindrome(String s, int i, int j) {
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++; j--;
            
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(s==null || s.length() ==0)
            return true;
        int i =0;
        int j = s.length()-1;
      
        while(i<j){            
            if(s.charAt(i) != s.charAt(j)){
                return isPanlindrome(s, i+1, j) || isPanlindrome(s, i, j-1);
                    
            }
            i++; j--;
                
        }
      
        return true;
    }
}