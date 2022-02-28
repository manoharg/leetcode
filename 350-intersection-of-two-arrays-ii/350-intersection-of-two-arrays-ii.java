class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(map.containsKey(i)&&map.get(i)>0){
                map.put(i, map.get(i)-1);
                list.add(i);
            }
        }
        int[] ans= new int[list.size()];
        int k=0;
        for(int i:list){
            ans[k++]=i;
        }
        return ans;
        
    }
}