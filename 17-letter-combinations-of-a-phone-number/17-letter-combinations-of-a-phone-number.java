class Solution {
    String[] map= new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() ==0){
            return new ArrayList<>();
        }
        if(digits.length()==1){
           List<String> empty = new ArrayList<>();
           String baseString = map[digits.charAt(0)-'0'-2];
           // System.out.println();
            for(int i=0;i<baseString.length();i++){
                empty.add(""+baseString.charAt(i));
            }
            return empty;
            
        }
        char first = digits.charAt(0);
        String rem = digits.substring(1);
        List<String> faith = letterCombinations(rem);
        String mapper = map[first-'0'-2];
       // System.out.println(first + " -> " + mapper);
        List<String> toReturn = new ArrayList<>();
        for(int i =0;i<mapper.length(); i++) {            
            for(int j=0;j<faith.size();j++){
                toReturn.add(mapper.charAt(i)+faith.get(j));
            }
        }
        return toReturn;
    }
}