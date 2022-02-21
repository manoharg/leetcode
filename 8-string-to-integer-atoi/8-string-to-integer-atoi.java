class Solution {
   
    public int myAtoi(String s) {
        if(s==null|| s.length()==0)
            return 0;
        s = s.trim();
        char sign = '+';
        if(s.isEmpty())
            return 0;
        if(s.charAt(0)=='+'||s.charAt(0)=='-')
            sign=s.charAt(0);
        int ans =0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(i==0 && (ch=='-'|| ch=='+'))
                continue;
            if(ch>='0'&&ch<='9'){
                if(ans>Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && ch-'0'>Integer.MAX_VALUE%10))
                {
                    if(sign=='-')
                        return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                ans = ans*10+ ch-'0';
            }else{
                break;
            }
        }
        if(sign=='-')
            ans = 0-ans;
        
        return ans;
    }
}