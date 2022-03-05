class Solution {

    public boolean checkInclusion(String s1, String s2) {
        /*
        Similar to anagarm
        Sliding winow
        Time complexity is O(s2.length())
        */
        Map<Character, Integer> pmap = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }
        int count = pmap.size(); // no of distinct characters in pattern
        int start = 0,end = 0;
        int k = s1.length();
        while (end < s2.length()) {
            char curChar = s2.charAt(end);
            if (pmap.containsKey(curChar)) {
                pmap.put(curChar, pmap.get(curChar) - 1);
                if (pmap.get(curChar) == 0) count--; // frequency of one char is met
            }
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                if (count == 0) return true;
                // remove calculations of i
                if (pmap.containsKey(s2.charAt(start))) {
                    pmap.put(s2.charAt(start), pmap.get(s2.charAt(start)) + 1);
                    if (pmap.get(s2.charAt(start)) == 1) count++;
                }

                start++;
                end++;
            }
        }
        return false;
    }
}
