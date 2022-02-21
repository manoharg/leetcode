class Solution {
    public String licenseKeyFormatting(String s, int k) {
         StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i = s.length()-1; i>= 0; i--){
            char c = s.charAt(i);
            if(c == '-') continue;
            if(cnt == k){
                sb.append('-');
                cnt = 0;
            }
            sb.append(Character.toUpperCase(c));
            cnt += 1;
        }
        return sb.reverse().toString();
    }
}