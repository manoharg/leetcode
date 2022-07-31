class Solution {
  public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        int n= s.length();
        for(int i=0;i<s.length();){
            if(sb.length()>0 && same(s.charAt(i), sb.charAt(sb.length()-1))){
                sb.deleteCharAt(sb.length()-1);
                i++;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
    private boolean same(Character one, Character two){
       if(one==two)
         return false;
        return Character.toUpperCase(one) == two || Character.toUpperCase(two)==one;
    }
}