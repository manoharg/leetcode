class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            map[ch-'a']=i;
        }
        
        int start =0;
        int last =0;
        for(int i=0;i<s.length();i++){
            last = Math.max(last, map[s.charAt(i)-'a']);
            if(last==i){
                res.add(last-start+1);
                start = last+1;
                last =0;
            }
        }
        return res;
    }
}