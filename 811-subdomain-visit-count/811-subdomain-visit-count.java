class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
     
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        if(cpdomains ==null || cpdomains.length ==0)
            return ans;
        for(int i=0;i<cpdomains.length; i++){
            String t = cpdomains[i];
            String[] parts = t.split(" ");
            Integer count = Integer.parseInt(parts[0]);
            String[] strParts = parts[1].split("\\.");

            int len = strParts.length;

            String temp = "";
           
    
            for(int j=strParts.length-1; j>=0; j--){
                temp = strParts[j] + (j<=strParts.length-2 ? "." : "") + temp;              
                map.put(temp, map.getOrDefault(temp,0)+count);
            }
        }
        for(String key: map.keySet()){

            ans.add(map.get(key) + " "+key);   
        }
        return ans;
        
    }
}