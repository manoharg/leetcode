class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // Min Heap.
        // TC O(nlogK)
        
       PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
           public int compare(int[] a, int[] b){
               return a[0]-b[0];
           }
       });
        
       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
         //  System.out.println(entry.getValue()+" "+entry.getKey());
           pq.offer(new int[]{entry.getValue(),entry.getKey()});
           if(pq.size()>k)
               pq.poll();
       }
    
        int[] res = new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            int[] x= pq.peek();
           // System.out.println(x[0]+" "+x[1]);
            res[i++]= (pq.poll())[1];
        }
        return res;
    }
}


 
    