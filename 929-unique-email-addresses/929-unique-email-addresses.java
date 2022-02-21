class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails){
            int at = email.indexOf('@');
            if(at==-1)
                continue;
            String domain = email.substring(at+1, email.length());
            String local = email.substring(0,at);
            String syn = getValid(local);
           
            set.add(syn+'@'+domain);
        }
        return set.size();
    }
    private String getValid(String a){
        StringBuilder sb = new StringBuilder();
        for(char ch: a.toCharArray()){
            if(ch=='+')
                break;
            if(ch!='.')
                sb.append(ch);
        }
        return sb.toString();
    }
}