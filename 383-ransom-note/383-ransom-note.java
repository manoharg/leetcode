class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            alphabet[magazine.charAt(i) - 'a'] += 1;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            alphabet[ransomNote.charAt(j) - 'a'] -= 1;
            if (alphabet[ransomNote.charAt(j) - 'a'] < 0) {
                return false;
            }
        }
        return true; 
    }
}