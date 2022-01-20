class Solution {
    public boolean isIsomorphic(String s, String t) {
     
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
          
            if(map.get(s.charAt(i))!=null){
               
                Character temp =map.get(s.charAt(i));
              
                if(temp!=null&& temp!=t.charAt(i)){
                    return false;
                }
                             
            }else{
               
                if(set.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
                
                    
            }
        }
        return true;
            
    }
}