class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int count=0;
      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          while(j<t.length()){
              if(t.charAt(j++)==ch){
                 count++;
                  break;
              }
          }
      }
       
      return count==s.length();  
        
    }
}