class Solution {

    public String minWindow(String s, String t) {
        int i = 0, j = 0, l = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (i = 0; i < t.length(); i++) map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        int count = map.size();
        int ans = Integer.MAX_VALUE;
        String ret = "";
        i = 0;
        while (j < l) {
            char ch = s.charAt(j);
            // count indicates the need of characters
    
            if (count > 0) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0) count--;
                }
            }
            
            // need is met, shrink the window size by removing unncessary characters and keep on updating ans.
            while (count == 0) {
                if (j - i + 1 < ans) {
                    ret = s.substring(i, j+1);
                    ans = j - i + 1;
                }
                ch = s.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) == 1) {
                        count++;
                    }
                }

                i++;
            }

            j++;
        }
      
        return ans == Integer.MAX_VALUE ? "" : ret;
    }
}
