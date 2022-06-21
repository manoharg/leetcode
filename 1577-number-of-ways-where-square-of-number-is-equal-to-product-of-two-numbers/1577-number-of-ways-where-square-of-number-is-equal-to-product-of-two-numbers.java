class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
       Map<Long,Integer> one = new HashMap<>();
        Map<Long,Integer> two = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            Long x = (long)nums1[i]*(long)nums1[i];
            one.put(x, one.getOrDefault(x,0)+1);
        }
        
       for(int i=0;i<nums2.length;i++){
            Long x = (long)nums2[i]*(long)nums2[i];
            two.put(x, two.getOrDefault(x,0)+1);
        }
        
        int ans =0;
       for(int i=0;i<nums1.length;i++){
        for(int j=i+1;j<nums1.length;j++){
            if(two.containsKey((long)nums1[i]*(long)nums1[j])) {
                ans+=two.get((long)nums1[i]*(long)nums1[j]);
               
            }
        }   
       }
        for(int i=0;i<nums2.length;i++){
        for(int j=i+1;j<nums2.length;j++){
            if(one.containsKey((long)nums2[i]*(long)nums2[j])) {
                ans+=one.get((long)nums2[i]*(long)nums2[j]);
            }
        }   
       }
        return ans;
    }
}