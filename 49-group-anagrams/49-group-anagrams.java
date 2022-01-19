class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            final String sortedWord = new String(wordArray);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            
             map.get(sortedWord).add(word);                
            }
    
        
        return new ArrayList<>(map.values());
        
    }
}