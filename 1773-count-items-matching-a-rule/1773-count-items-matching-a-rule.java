class Solution {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type")) {
                if (item.get(0).equals(ruleValue)) c++;
            } else if (ruleKey.equals("color")) {
                if (item.get(1).equals(ruleValue)) c++;
            } else if (ruleKey.equals("name")) {
                if (item.get(2).equals(ruleValue)) c++;
            }
        }
        return c;
    }
}
