class Solution {
    public String frequencySort(String s) {
     Map<Character,Integer> freqMap = new HashMap<>();
       for(char ch:s.toCharArray()){
           freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
       } 
       /*
       tree
       t-1
       r-1
       e-2
       */
     PriorityQueue<Map.Entry<Character,Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(freqMap.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry entry = pq.poll();
            for(int i=0;i<(int)entry.getValue();i++){
                sb.append((char)entry.getKey());
            }
        }
        
        return sb.toString();
        
    }
}